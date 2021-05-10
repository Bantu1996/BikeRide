package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Bicycle bicycle1 = new Bicycle();
        BikeRide bike1 = new BikeRide(bicycle1);
        bike1.ride();
        assertEquals(14, bike1.currentSpeed());

    }
}
