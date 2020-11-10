package garage;

public class Truck extends Vehicle {
	
	
	


	public Truck(int vehicleId, String model, int year) {
		super();
		this.vehicleType = "Truck";
		this.vehicleId = vehicleId;
		this.model = model;
		this.year = year;
		this.repairModif = 1000;
		
	}

	public int getRepairModif() {
		return repairModif;
	}

	@Override
	public String toString() {
		return "Truck [vehicleType=" + vehicleType + ", vehicleId=" + vehicleId + ", repairModif=" + repairModif
				+ ", model=" + model + ", year=" + year + "]";
	}
	
	


}
