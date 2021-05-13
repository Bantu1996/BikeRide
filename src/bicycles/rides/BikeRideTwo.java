package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide {
    //    a final variable cannot be reassigned

    public final Bicycle bicycle;


    public BikeRideTwo(Bicycle bike) {//    a final variable cannot be reassigned

        this.bicycle = bike;
    }
    public int currentSpeed (){
        return this.bicycle.currentSpeed();
    }
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    @Override
    public void ride(Bicycle bicycle) {

    }
}
