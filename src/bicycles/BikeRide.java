package bicycles;

public class BikeRide {
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

    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        BikeRide bike1 = new BikeRide(bicycle1);
        bike1.ride();

        System.out.println(bike1.currentSpeed());
    }
}
