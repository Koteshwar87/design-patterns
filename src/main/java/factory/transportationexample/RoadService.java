package factory.transportationexample;

public class RoadService implements TransportService{
    @Override
    public String getPickupPoint() {
        return "Godown";
    }

    @Override
    public Vehicle transport() {
        System.out.println("Raod service");
        return new Truck();
    }
}
