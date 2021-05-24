package rides;

import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import model.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
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

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);

        funRide.accept(bicycle);
        funRide.accept(bicycle1);

        assertEquals(2,funRide.getEnteredCount());
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
