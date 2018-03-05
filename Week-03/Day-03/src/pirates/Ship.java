package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private int strength;
    private List<Pirate> ppl = new ArrayList<Pirate>();

    public Ship(){

    }

    public void fillShip(){
        generatePirates();
        this.strength = this.ppl.size();
    }

    public void generatePirates(){
        int k = 0;
        Random rand = new Random();
        int n = rand.nextInt(15) + 11;
            for (int i = 1;i < n; i++) {
                if (k == 0) {
                    String rank1 = "Captain";
                    ppl.add(new Pirate(rank1));
                    k++;
                } else {
                    String rank1 = "Pirate";
                    ppl.add(new Pirate(rank1));
                    k++;
                }
            }

    }

    public void shipInfo(){
        System.out.println("There are "+ this.ppl.size() +" pirates on the board: ");
        for (int i = 0; i < this.ppl.size(); i++) {
            System.out.println(this.ppl.get(i).toString());
        }
    }

    public void shipBattle(){
        Random rand = new Random();
        int otherShipStrength = rand.nextInt(16) + 11;

        if (this.ppl.size() < otherShipStrength) {
            System.out.println("You lost!");
        } else if (this.ppl.size() == otherShipStrength) {
            System.out.println("Everybody died.");
        } else if (this.ppl.size() > otherShipStrength) {
            System.out.println("You won!");
        }

    }


}
