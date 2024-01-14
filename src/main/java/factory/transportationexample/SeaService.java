package factory.transportationexample;

public class SeaService implements TransportService{
    @Override
    public String getPickupPoint() {
        return "Port";
    }

    @Override
    public Vehicle transport() {
        System.out.println("Sea service");
        return new Ship();
    }
}
