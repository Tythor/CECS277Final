package FinalExam;

public class SmallPartyRoom extends Room{
	
	

	public SmallPartyRoom() {
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
		return("Small Party Room: \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}


