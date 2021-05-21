package rides;

import bicycles.*;
import bicycles.rides.*;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import model.Bicycle;
import model.MountainBike;
import model.RoadBike;
import model.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneMountainBike() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

        assertEquals(14, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneRoadBike() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride();

        assertEquals(36, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneTandem() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride();

        assertEquals(34, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoMountainBike() {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride();

        assertEquals(42, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoRoadBike() {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();

        assertEquals(95, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoTandem() {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride();

        assertEquals(101, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeMountainBike() {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();

        assertEquals(1, bikeRideThree.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeRoadBike() {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();

        assertEquals(10, bikeRideThree.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeTandem() {
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride();

        assertEquals(3, bikeRideThree.currentSpeed());

    }
    @Test
    public void shouldShowMountainBikeSpecs(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        assertEquals(5,mountainBikeSpec.getAccelerationSpeed());

        assertEquals(3,mountainBikeSpec.getBrakeSpeed());

        assertEquals(BicycleType.MountainBike,mountainBikeSpec.getBicycleType());
    }

    @Test
    public void shouldShowRoadBikeSpecs(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        assertEquals(11,roadBikeSpec.getAccelerationSpeed());

        assertEquals(4,roadBikeSpec.getBrakeSpeed());

        assertEquals(BicycleType.RoadBike,roadBikeSpec.getBicycleType());
    }

    @Test
    public void shouldShowTandemSpecs(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        assertEquals(12,tandemSpec.getAccelerationSpeed());

        assertEquals(7,tandemSpec.getBrakeSpeed());

        assertEquals(BicycleType.Tandem,tandemSpec.getBicycleType());
    }

    @Test
    public void shouldShowMountainBikeFunRides(){
        FunRide funRide = new FunRide(9);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        funRide.accept(bicycle);

        assertEquals(1,funRide.getEnteredCount());
    }

    @Test
    public void shouldShowRoadBikeFunRides(){
       FunRide funRide = new FunRide(9);

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        funRide.accept(bicycle);
        assertEquals(1,funRide.getEnteredCount());
    }
@Test
    public void shouldShowTandemFunRides(){
        FunRide funRide = new FunRide(9);

        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        funRide.accept(bicycle);
        assertEquals(1,funRide.getEnteredCount());
    }

    @Test
    public void shouldShowMountainBikeFunRidesTypes(){
        FunRide funRide = new FunRide(9);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        funRide.accept(bicycle);
        assertEquals(1,funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void shouldShowRoadBikeFunRidesTypes(){
        FunRide funRide = new FunRide(9);

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        funRide.accept(bicycle);
        assertEquals(1,funRide.getCountForType(BicycleType.RoadBike));
    }
    @Test
    public void shouldShowTandemFunRidesTypes(){
        FunRide funRide = new FunRide(9);

        BicycleSpecification tandemSpec = new BicycleSpecification(5, 3, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        funRide.accept(bicycle);
        assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
    }


}
