package garage;

public class Motorcycle extends Vehicle {
	
	
	


	public Motorcycle(int vehicleId, String model, int year) {
		super();
		this.vehicleType = "Motorcycle";
		this.vehicleId = vehicleId;
		this.model = model;
		this.year = year;
		this.repairModif = 250;
		
	}

	public int getRepairModif() {
		return repairModif;
	}

	@Override
	public String toString() {
		return "Motorcycle [vehicleType=" + vehicleType + ", vehicleId=" + vehicleId + ", repairModif=" + repairModif
				+ ", model=" + model + ", year=" + year + "]";
	}
	


}
