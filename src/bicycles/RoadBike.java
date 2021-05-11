package bicycles;

public class RoadBike implements Bicycle {
    private int speed;

    @Override
    public void accelerate() {
    speed += 11;
    }

    @Override
    public void brake() {
    speed -= 4;
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
