package bicycles.specifications;

import bicycles.BicycleBase;


public abstract class BicycleFromSpec extends BicycleBase {
    private final bicycles.specifications.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec(bicycles.specifications.BicycleSpecification bicycleSpecification) {
        BicycleSpecification = bicycleSpecification;
    }
}
