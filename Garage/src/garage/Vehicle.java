package garage;

public abstract class Vehicle {
	
	protected String vehicleType = "unspecified";
	protected int vehicleId = 0;
	protected int repairModif = 10;
	protected String model = "toyota";
	protected int year = 2009;

	
	public Vehicle() {}
	

	public Vehicle(String vehicleType, int vehicleId, int repairModif, String model, int year) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleId = vehicleId;
		this.repairModif = repairModif;
		this.model = model;
		this.year = year;
	}




	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getRepairModif() {
		return repairModif;
	}

	public void setRepairModif(int repairModif) {
		this.repairModif = repairModif;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleId=" + vehicleId + ", repairModif=" + repairModif
				+ ", model=" + model + ", year=" + year + "]";
	}
	
	
		
	}



