package bicycles;

public class BikeRide {
//    a final variable cannot be reassigned
    public final Bicycle bicycle;


public BikeRide (Bicycle bike) {
    this.bicycle = bike;
}
    public int currentSpeed (){
        return this.bicycle.currentSpeed();
    }
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
}

