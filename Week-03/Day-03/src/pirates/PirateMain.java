package pirates;

import java.util.Scanner;

public class PirateMain {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("Pirate");
        Ship ship = new Ship();
        //pirate.pirateInfo();

        //pirate.drinkSomeRum();
        //pirate.howsItGoingMate();
        //pirate.brawl();

        //ship.fillShip();
        //ship.shipInfo();

        chooseType();
    }

    public static void chooseType(){
        System.out.println("For playing with a pirate, type: pirate");
        System.out.println("For playing with a ship, type: ship");
        System.out.println("For playing with an armada, type: armada");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("pirate")){
            Pirate pirate = new Pirate("Pirate");
            pirateGame(pirate);
        } else if (type.equals("ship")) {
            Ship ship = new Ship();
            ship.fillShip();
            shipGame(ship);
        } else if (type.equals("armada")) {

        } else {
            System.out.println("Wrong input!");
            chooseType();
        }
    }

    private static void pirateGame(Pirate pirate) {
        System.out.println(" ");
        System.out.println("For drinking type: drink");
        System.out.println("For info type: info");
        System.out.println("For check type: check");
        System.out.println("For fighting an other pirate type: fight");
        System.out.println("For restart type: restart");
        System.out.println("For exit game type: exit");
        Scanner scanner = new Scanner(System.in);
        String todo = scanner.nextLine();

        if (todo.equals("drink")){
            pirate.drinkSomeRum();
            pirateGame(pirate);
        } else if (todo.equals("info")) {
            pirate.pirateInfo();
            pirateGame(pirate);
        } else if (todo.equals("check")) {
            pirate.howsItGoingMate();
            pirateGame(pirate);
        } else if (todo.equals("fight")) {
            pirate.brawl();
            pirateGame(pirate);
        } else if (todo.equals("restart")) {
            pirate.resuscitate();
            pirateGame(pirate);
        } else if (todo.equals("die")) {
            pirate.die();
            pirateGame(pirate);
        } else if (todo.equals("exit")) {

        } else {
            System.out.println("Wrong input!");
            pirateGame(pirate);
        }
    }

    private static void shipGame(Ship ship) {
        System.out.println(" ");
        System.out.println("For info type: info");
        System.out.println("For fighting an other ship type: fight");
        System.out.println("For restart type: restart");
        System.out.println("For exit game type: exit");
        Scanner scanner = new Scanner(System.in);
        String todo = scanner.nextLine();

        if (todo.equals("info")){
            ship.shipInfo();
            shipGame(ship);
        } else if (todo.equals("fight")) {
            ship.shipBattle();
            shipGame(ship);
        } else if (todo.equals("restart")) {
            ship.fillShip();
            shipGame(ship);
        } else if (todo.equals("exit")) {

        } else {
            System.out.println("Wrong input!");
            shipGame(ship);
        }
    }
}
