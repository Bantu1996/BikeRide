package rides;

import bicycles.MountainBike;
import bicycles.RoadBike;
import bicycles.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneMountainBike() {
        MountainBike mountainBike= new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();

        assertEquals(14, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneRoadBike() {
        RoadBike roadBike= new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride();

        assertEquals(36, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideOneTandem() {
        Tandem tandem= new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride();

        assertEquals(34, bikeRideOne.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoMountainBike() {
        MountainBike mountainBike= new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride();

        assertEquals(42, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoRoadBike() {
        RoadBike roadBike= new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();

        assertEquals(95, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideTwoTandem() {
        Tandem tandem= new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride();

        assertEquals(101, bikeRideTwo.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeMountainBike() {
        MountainBike mountainBike= new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();

        assertEquals(1, bikeRideThree.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeRoadBike() {
        RoadBike roadBike= new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();

        assertEquals(10, bikeRideThree.currentSpeed());

    }
    @Test
    public void shouldDoRidesCorrectlyOnBikeRideThreeTandem() {
        Tandem tandem= new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride();

        assertEquals(3, bikeRideThree.currentSpeed());

    }

}
