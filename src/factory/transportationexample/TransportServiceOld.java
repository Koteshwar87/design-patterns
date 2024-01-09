package factory.transportationexample;

public class TransportServiceOld {
    /*public String getPickupPoint(){

    }
    public Vehicle getVehicle(){

    }*/

    public static void main(String[] args) {
        TransportService transportService = new RoadService(); // "AIR" "ROAD"
        transportService.getPickupPoint();
        Vehicle vehicle = transportService.transport();

        System.out.println(vehicle.getVehicle());

    }
}
