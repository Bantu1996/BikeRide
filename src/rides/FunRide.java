package rides;

import model.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
public int maximum;
int count = 0;

    private List <Bicycle> bicycleList = new ArrayList<Bicycle>();
    public FunRide(int maximum) {
        this.maximum = maximum;
    }
     public void accept(Bicycle bicycle) {
    if(!bicycleList.contains(bicycle) && this.maximum > bicycleList.size()){
bicycleList.add(bicycle);
    }
    else{
       System.out.println("Bicycle list is full!!!");
    }
    }
    public int getCountForType(BicycleType bicycleType) {
        final int maximum = this.maximum;
        for (Bicycle bicycle : bicycleList) {
            if (bicycleType == bicycle.getBicycleType()) {
                count++;
            }
        }
        return maximum;
    }
    public int getEnteredCount(){
        return bicycleList.size();
    }
    }
