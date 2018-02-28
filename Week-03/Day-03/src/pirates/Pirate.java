package pirates;

import java.util.Random;

public class Pirate {
    private int intoxication;
    private boolean alive;
    private String pirateName;

    public Pirate() {
        this.pirateName = nameGenerator();
        this.intoxication = 0;
        this.alive = true;
    }

    public void drinkSomeRum() {
        if (alive == true) {
            this.intoxication++;
        } else {
            die();
        }

    }

    public void howsItGoingMate() {
        if (alive == true) {
            if (this.intoxication <= 4 && this.intoxication >= 0) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        } else {
            die();
        }
    }

    public void die() {
        this.alive = false;
        System.out.println("He's dead!");
    }

    public void brawl() {
        if (alive == true) {
            String otherPirate = "Jack Sparrow";
            Random rand = new Random();
            int n = rand.nextInt(3) + 1;
            if (n == 1) {
                System.out.println("You, "+ this.pirateName + " lost, " + otherPirate + " won the fight!");
                die();
            } else if (n == 2) {
                System.out.println("You, "+ this.pirateName + " defeated " + otherPirate + "!");
            } else {
                System.out.println("You, "+ this.pirateName + " lost, but " + otherPirate + " died too!");
                die();
            }
        } else {
            die();
        }
    }

    public void resuscitate() {
        this.intoxication = 0;
        this.alive = true;
    }

        public String nameGenerator(){

            String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
                    "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "B", "Mjol",
                    "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
                    "Mar", "Luk" };
            String[] Middle = { "o", "ir", "mi", "sor", "mee", "clo",
                    "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
                    "marac", "zoir", "slamar", "salmar", "urak" };
            String[] End = { "d", "ed", "B", "arc", "es", "er", "der",
                    "tron", "med", "ure", "zur", "cred", "mur" };

            Random rand = new Random();

            String name = "Bob "+ Beginning[rand.nextInt(Beginning.length)] + Middle[rand.nextInt(Middle.length)]+
                    End[rand.nextInt(End.length)];

        return name;
        }
}
