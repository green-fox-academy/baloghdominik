package flyable;

public class Helicopter extends Vehicle implements Flyable {
    public Helicopter(String type, int power, int fuelAmount) {
        super(type, power, fuelAmount);
    }

    @Override
    public void fly() {
        System.out.println("WOW, this helicopter is fast af.");
    }

    @Override
    public void land() {
        System.out.println("The helicopter landed successfully.");
    }

    @Override
    public void takeOff() {
        System.out.println("The helicopter has taken off!");
    }

    public static void main(String[] args) {
        Helicopter myHelicopter = new Helicopter("LuxoryHeli", 1000, 700);
        myHelicopter.takeOff();
        myHelicopter.fly();
        myHelicopter.land();
    }
}
