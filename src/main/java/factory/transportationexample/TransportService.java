package factory.transportationexample;

public interface TransportService {

    public String getPickupPoint(); // Non factory method
    public Vehicle transport();  // Factory method

}


// TransportService
    // getpickupPoint() // non factory
    // Vehicle getVehicl(String mode) // Factory method