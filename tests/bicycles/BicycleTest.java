package bicycles;

import bicycles.specifications.BicycleSpecification;
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
    public void shouldBeAbleToBreakOnMountainBike() {
        MountainBike bicycle = new MountainBike();
        bicycle.brake();

        assertEquals(-3, bicycle.currentSpeed());
    }

    @Test
    public void shouldBeAbleToBreakOnRoadBike() {
        RoadBike bicycle = new RoadBike();
        bicycle.brake();

        assertEquals(-4, bicycle.currentSpeed());
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
    @Test
    public void shouldBeAbleToStopOnMountainBike() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

}
    @Test
    public void shouldBeAbleToStopOnRoadBike() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnMountainBike() {

        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        assertEquals(45, mountainBike.currentSpeed());

    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnRoadBike() {

        RoadBike roadbike = new RoadBike();
        roadbike.accelerate();
        roadbike.accelerate();
        roadbike.accelerate();
        roadbike.accelerate();
        roadbike.accelerate();
        roadbike.accelerate();
        roadbike.accelerate();
        assertEquals(77, roadbike.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectlyOnTandem() {

        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();

        assertEquals(60, tandem.currentSpeed());

    }
    @Test
    public void shouldShowMountainBikeSpecs(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);

        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());

        assertEquals(3,mountainBikeSpec.getBrakeSpeed());
    }
    @Test
            public void shouldShowRoadBikeSpecs(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);

        assertEquals(11,roadBikeSpec.getAccelerationSpeed());

        assertEquals(4,roadBikeSpec.getBrakeSpeed());
    }
    @Test
    public void shouldShowTandemSpecs(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7);

        assertEquals(12,tandemSpec.getAccelerationSpeed());

        assertEquals(7,tandemSpec.getBrakeSpeed());
    }

}
