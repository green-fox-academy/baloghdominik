package petrolstation;

public class car {
    private static int gasAmount = 0;
    private static int capacity = 100;

    public static void setGasAmount(int gasAmount) {
        car.gasAmount = gasAmount;
    }
    public static int getCapacity() {
        return capacity;
    }
}