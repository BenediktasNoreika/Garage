package garage;

public class Car extends Vehicle {
	
	
	


	public Car(int vehicleId, String model, int year) {
		super();
		this.vehicleType = "Car";
		this.vehicleId = vehicleId;
		this.model = model;
		this.year = year;
		this.repairModif = 500;
		
	}

	public int getRepairModif() {
		return repairModif;
	}

	@Override
	public String toString() {
		return "Car [vehicleType=" + vehicleType + ", vehicleId=" + vehicleId + ", repairModif=" + repairModif
				+ ", model=" + model + ", year=" + year + "]";
	}


}
