package FinalExam;

public class MediumPartyRoom extends Room{

	public MediumPartyRoom() {
		super.setCapacity(45);
		super.setDescription("Room with party tables and chairs, quick access to arcade. Includes table & chair set-up, DJ, and basic meal plan in cost.");
		getCost();
	}
	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 250;
		return cost;
	}
	
	public String toString() {
		return("Medium Party Room: \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}
