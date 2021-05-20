package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
int maximum;
int count;

    private List <Bicycle> bicycleList = new ArrayList<Bicycle>();
    FunRide(int maximum) {
        this.maximum = maximum;
    }
    void accept(Bicycle bicycle) {
    if(bicycleList.isEmpty() && this.maximum > bicycleList.size()){
bicycleList.add(bicycle);
    }
    else{
       System.out.println("Bicycle list is full!!!");
    }
    }
    public int getCountForType(BicycleType bicycleType) {
        if(this.count < bicycleList.size()) {
            count++;
}
        return count;
    }
    }
