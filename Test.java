package bttest;

public class Test {
	public static void main(String[] args) {
	 Vehicle car = new Car("ABC-123", "Gasoline");
     Vehicle motorcycle = new Motorcycle("XYZ-789", "Petrol");
     System.out.println("CAR: ");
     car.start();
     car.stop();
     System.out.println(car.getFuelType());
     System.out.println();
     System.out.println("MOTORCYCLE: ");
     motorcycle.start();
     motorcycle.stop();
     System.out.println(motorcycle.getFuelType());
     System.out.println();
     System.out.println("ELECTRIC CAR: ");
     Vehicle electricCar = new ElectricCar("ELEC-456");
     electricCar.start();
     electricCar.stop();
     System.out.println(electricCar.getFuelType());
     System.out.println();
     System.out.println("MANAGER: ");
     VehicleManager manager = new VehicleManager();
     manager.registerVehicle(car);
     System.out.println();
     manager.registerVehicle(motorcycle);
     System.out.println();
     manager.registerVehicle(electricCar);
	}
}
