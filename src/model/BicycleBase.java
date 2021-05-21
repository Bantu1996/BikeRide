package model;

import model.Bicycle;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int pace) {
        speed += pace;
    }
    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public int stop() {
        return speed = 0;
    }

}
