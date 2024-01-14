package factory.transportationexample;

public class Plane implements Vehicle{
    @Override
    public Vehicle getVehicle() {
        System.out.println("Plane");
        return new Plane();
    }
}
