package bicycles;

public class MountainBike implements Bicycle {
    private int speed;
    @Override
    public void accelerate() {
    speed += 5;
    }

    @Override
    public void brake() {
    speed -= 3;
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
