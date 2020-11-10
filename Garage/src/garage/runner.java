package garage;

public class runner {
	 public static void main(String[] args) {
		 
		 Garage g = new Garage();
		 g.addVehicle(new Car(1, "Scoda", 2003));
		 g.addVehicle(new Truck(2, "Ford", 2009));
		 g.addVehicle(new Motorcycle(3, "Toyota", 2018));
		 g.addVehicle(new Car(4, "Ford", 2002));
		 g.addVehicle(new Car(5, "Lotus", 2013));
		 g.addVehicle(new Truck(6, "Honda", 2001));
		 g.addVehicle(new Motorcycle(7, "bentley", 2020));
		 g.addVehicle(new Car(8, "Ferrai", 2019));

		 
		 System.out.println("***All vehicles in the garage and the total cost***");
		 g.listVehicles();
		 g.calculateCost();
		 
		 System.out.println("***Remove by ID(8)***");
		 g.removeById(8);
		 g.listVehicles();
		 g.calculateCost();
		 
		 System.out.println("***Remove all trucks***");
		 g.removeByType("Truck");
		 g.listVehicles();
		 
		 System.out.println("***Increase repair price***");
		 g.calculateCost();
		 g.changeRepairCost(400);
		 g.calculateCost();
		 
		 System.out.println("***Clear the garage***");
		 g.clearGarage();
		 g.listVehicles();
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
	 }

}
