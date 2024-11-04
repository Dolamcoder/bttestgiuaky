package bttest;

public class ElectricCar extends Car{

	public ElectricCar(String xeId) {
		super(xeId, "Electric");
	}
	public String getFuelType() {
		return super.getFuelType();
	}

}
