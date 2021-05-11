package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccelerateOnMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();

        assertEquals(5, bicycle.currentSpeed());
    }
    @Test
    public void shouldAccelerateOnRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();

        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrectlyOnMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(8, bicycle.currentSpeed());

    }
    @Test
    public void shouldAccelerateAndBrakeCorrectlyOnRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }
//    @Test
//    public void shouldDoMultipleAcceleratesCorrectly() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        bicycle.accelerate();
//        assertEquals(15, bicycle.currentSpeed());
//
//    }
//    @Test
//    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.brake();
//        assertEquals(1, bicycle.currentSpeed());
//
//    }
//    @Test
//    public void shouldBeAbleToStop() {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.stop();
//        assertEquals(0, bicycle.currentSpeed());
//
//    }
//    @Test
//    public  void shouldBeAbleToAccelerateAfterStopping() {
//        Bicycle bicycle = new Bicycle();
//        bicycle.stop();
//        bicycle.accelerate();
//        assertEquals(5, bicycle.currentSpeed());
//    }
//    @Test
//    public void shouldBeAbleToBreak() {
//        Bicycle bicycle = new Bicycle();
//
//        bicycle.brake();
//        assertEquals(-3, bicycle.currentSpeed());
//    }
}
