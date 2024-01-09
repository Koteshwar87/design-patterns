package factory.transportationexample;

public class AirService implements TransportService{


    @Override
    public String getPickupPoint() {
        return "Airport";
    }

    @Override
    public Vehicle transport() {
        System.out.println("Air service");
        return new Plane();
    }
}
