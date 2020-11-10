package garage;

import java.util.ArrayList;
import java.util.ListIterator;

public class Garage {
	
	protected int repairCost = 200;
	
	ArrayList<Vehicle> list;
	
	public Garage()
	{
		ArrayList<Vehicle> list = new ArrayList<>();
		this.list = list;
		
	}
	
	public void addVehicle(Vehicle vehicle)
	
		{
			list.add(vehicle);
		}
		
	
	public void calculateCost()
	{
		int currentCost = 0;
		
		for(Vehicle handle: list)
		{
		currentCost = currentCost + (repairCost + handle.getRepairModif());
		}
		
		System.out.println("The total cost of this garage is: £" + currentCost);	
	}
	
	public void listVehicles()
	{
		for(Vehicle handle: list)
		{
			System.out.println(handle.toString());
		}
	}
	
	public void removeById(int ID)
	{
		ListIterator<Vehicle> iter = list.listIterator();
		while(iter.hasNext()) {
			
		
			if(iter.next().getVehicleId() == ID)
			{
				iter.remove();
				System.out.println("Removed Vehicle ID: " + ID + " from the list");

			}
		}
	}
		
		public void removeByType(String type)
		{
			ListIterator<Vehicle> iter = list.listIterator();
			while(iter.hasNext()) {
				
			
				if(iter.next().getVehicleType().equals(type))
				{
					iter.remove();
					System.out.println("Removed Vehicle ID: " + type + " from the list");

				}
			}
		}
		public void clearGarage()
		{
			list.clear();
			System.out.println("Garage cleared");
		}
		
		public void changeRepairCost(int newRate)
		{
			repairCost = newRate;
		}
	

}
