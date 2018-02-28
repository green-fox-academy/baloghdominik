package petrolstation;

public class station {

    private int gasAmount = 1000;

    public void refill() {
        gasAmount -= car.getCapacity();
        car.setGasAmount(gasAmount);
    }

}