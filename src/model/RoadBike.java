package model;

import bicycles.BicycleType;

//Bicycle is an interface that means its an Abstract class...
public class RoadBike extends BicycleBase {
//    private int speed;

    @Override
    public void accelerate() {
    changeSpeed( 11);
    }

    @Override
    public void brake() {
   changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }

}
