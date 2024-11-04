package bttest;

public class VehicleManager {
	  public void registerVehicle(Vehicle vehicle) {
	        vehicle.start();
	        System.out.println("Vehicle type: " + vehicle.getClass().getSimpleName());
	        System.out.println("Fuel type: " + vehicle.getFuelType());
	        vehicle.stop();
	    }
}
