package bicycles.specifications;

import bicycles.BicycleBase;
import bicycles.BicycleType;


public class BicycleFromSpec extends BicycleBase {
    private final bicycles.specifications.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec(bicycles.specifications.BicycleSpecification bicycleSpecification) {
        BicycleSpecification = bicycleSpecification;
    }

    public void accelerationSpeed(){
        this.BicycleSpecification.getAccelerationSpeed();
    }

    public void brakeSpeed(){
        this.BicycleSpecification.getBrakeSpeed();
    }


    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }

    @Override
    public BicycleType getBicycleType() {
        return this.BicycleSpecification.getBicycleType();
    }
}
