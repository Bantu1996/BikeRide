package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
int maximum;
int count = 0;

    private List <Bicycle> bicycleList = new ArrayList<Bicycle>();
    public FunRide(int maximum) {
        this.maximum = maximum;
    }
     public void accept(Bicycle bicycle) {
    if(bicycleList.isEmpty() && this.maximum > bicycleList.size()){
bicycleList.add(bicycle);
    }
    else{
       System.out.println("Bicycle list is full!!!");
    }
    }
    public int getCountForType(BicycleType bicycleType) {
        for (Bicycle bicycle : bicycleList) {
            if (bicycleType == bicycle.getBicycleType()) {
                count++;
            }
        }
        return count;
    }
    public int getEnteredCount(){
        return bicycleList.size();
    }
    }
