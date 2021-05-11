package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnMountainBike() {

        MountainBike bicycle1 = new MountainBike();
        BikeRide bike1 = new BikeRide(bicycle1);
        bike1.ride();
        assertEquals(26, bike1.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnRoadBike() {

        RoadBike bicycle1 = new RoadBike();
        BikeRide bike1 = new BikeRide(bicycle1);
        bike1.ride();
        assertEquals(36, bike1.currentSpeed());

    }
}
