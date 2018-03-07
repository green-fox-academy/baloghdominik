package flyable;

public abstract class Vehicle {
    public String type;
    public int power;
    public int fuelAmount;

    public Vehicle(String type, int power, int fuelAmount){
        this.type = type;
        this.power = power;
        this.fuelAmount = fuelAmount;
    }

}
