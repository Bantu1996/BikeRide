package bicycles;

public class MountainBike extends BicycleBase  {
//    private int speed;

    @Override
    public void accelerate() {
    changeSpeed(5);
    }

    @Override
    public void brake() {
    changeSpeed(-3);
    }
}
