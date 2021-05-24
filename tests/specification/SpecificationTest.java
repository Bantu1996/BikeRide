package specification;

import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import model.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
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
}
