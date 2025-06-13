package Ex2;

enum VehicleType {
	CAR,
	TRUCK,
	MOTORCYCLE,
	BUS
}


public class Vehicle {
	
	static int totalVehicles;
	final String registrationNumber, model;
	final int maxSpeed;
	
	final VehicleType vehicleType;
	
	private boolean maintenanceStatus;
	
	{
		totalVehicles++;
	}
	
	public Vehicle(String model, VehicleType vehicle, String registrationNumber, int maxSpeed) {
		
		this.vehicleType = vehicle;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.maxSpeed = maxSpeed;
		maintenanceStatus = true;
		
	}
	
	public VehicleType getVehicleType() {return this.vehicleType;}
	
	public boolean getMaintenanceStatus() {return this.maintenanceStatus;}
	
	public void setMaintenanceStatus(boolean status) {this.maintenanceStatus = status;}
	
	public int getMaxSpeed() {return this.maxSpeed;}
	
	public String getModel() {return this.model;}
	
	public String toString() {
		return "Type:" + vehicleType
				+ "\nModel: " + getModel() 
				+ "\nMaintenance Status: " 
				+ this.maintenanceStatus + "\nMax Speed: " 
				+ this.maxSpeed + "\n";
		
	}

}
