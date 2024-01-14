package factory.transportationexample;

public class Ship implements Vehicle{
    @Override
    public Vehicle getVehicle() {
        System.out.println("Ship");
        return new Ship();
    }
}
