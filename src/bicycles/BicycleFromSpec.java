package bicycles;

import model.BicycleBase;


public class BicycleFromSpec extends BicycleBase {
    private final bicycles.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec(bicycles.BicycleSpecification bicycleSpecification) {
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
