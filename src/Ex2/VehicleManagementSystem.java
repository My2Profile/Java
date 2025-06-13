package Ex2;


public class VehicleManagementSystem {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("Honda", VehicleType.CAR, "256EDF02", 200);
		vehicle1.setMaintenanceStatus(false);
		Vehicle vehicle2 = new Vehicle("Mazda", VehicleType.MOTORCYCLE, "222EFF01", 180);
		Vehicle vehicle3 = new Vehicle("Mercedes", VehicleType.TRUCK, "111MER01", 320);
		
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		System.out.println(vehicle3.toString());
		System.out.println(Vehicle.totalVehicles);
	}

}
