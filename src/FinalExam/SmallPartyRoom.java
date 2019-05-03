package FinalExam;

public class SmallPartyRoom extends Room{
	
	

	public SmallPartyRoom() {
		super.name = "Small Party Room";
		super.setCapacity(30);
		super.setDescription("Room with party tables and chairs, adjacent to arcade. Includes table & chair set-up and basic meal plan in cost.");
		getCost();
	}
	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 150;
		return cost;
	}
	
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}


