package factory.transportationexample;

public class Truck implements Vehicle{
    @Override
    public Vehicle getVehicle() {
        System.out.println("Truck");
        return new Truck();
    }
}
