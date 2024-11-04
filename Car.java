package bttest;

public class Car implements Vehicle{
	private String xeId;
	private String fuelType;

public Car(String xeId, String fuelType) {
		this.xeId = xeId;
		this.fuelType = fuelType;
	}
public void start() {
	System.out.println("Car with license plate " + this.xeId + " is Starting.");
}
public void stop() {
	System.out.println("Car with license plate " + this.xeId + " is Stopping.");
}
public String getFuelType() {
	return "Fuel type is: "+this.fuelType;
}
}
