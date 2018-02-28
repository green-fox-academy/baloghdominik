package pirates;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
    private ArrayList pirates = new ArrayList();
    private int strength;

    public Ship(){

    }

    public void fillShip(){
        generatePiratesWithNames();
        this.strength = this.pirates.size();
    }

    public void generatePiratesWithNames() {
        Random rand = new Random();
        int n = rand.nextInt(25) + 10;

        for (int i = 0; i < n; i++){

        }

    }
}
