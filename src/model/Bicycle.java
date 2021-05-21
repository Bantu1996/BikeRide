package model;

import bicycles.BicycleType;

public interface Bicycle {

     void  accelerate();

     void brake ();

     int currentSpeed ();

     int stop ();

     BicycleType getBicycleType();


}
