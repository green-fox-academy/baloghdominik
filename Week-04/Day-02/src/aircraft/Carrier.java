package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts;
    private int ammoStorage;

    public Carrier(int ammo){
        this.aircrafts = new ArrayList<>();
        this.ammoStorage = ammo;
    }

    public void addAircraft(String type){
        if (type == "F16"){
            this.aircrafts.add(new Aircraft(type, 30));
        } else if (type == "F35"){
        }
        this.aircrafts.add(new Aircraft(type, 50));
    }

    public void fill(){
        //Elfáradtam!
    }
}

