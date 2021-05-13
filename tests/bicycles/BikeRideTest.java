package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnMountainBike() {

        MountainBike bicycle1 = new MountainBike();
        MountainBike bike1 = new MountainBike(bicycle1);
        bike1.ride();
        assertEquals(14, bike1.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnRoadBike() {

        RoadBike bicycle2 = new RoadBike();
         bike2 = new BikeRideOne(bicycle2);
        bike2.ride();
        assertEquals(36, bike2.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnTandem() {

        Tandem bicycle3 = new Tandem();
        BikeRideOne bike3 = new BikeRideOne(bicycle3);
        bike3.ride();
        assertEquals(34, bike3.currentSpeed());

    }
}
