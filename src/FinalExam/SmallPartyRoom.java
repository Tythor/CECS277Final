package FinalExam;

/**
 * @author audreybrio (group 6)
 * @release date - May 6, 2019
 * this class is a subclass of room and gets the information details of the small party room
 * **/

public class SmallPartyRoom extends Room{
	
	/**
	 * constructor that sets the information specific to the room
	 * **/
	public SmallPartyRoom() {
		super.name = "Small Party Room";
		super.setCapacity(30);
		super.setDescription("Room with party tables and chairs, adjacent to arcade. \nIncludes table & chair set-up and basic meal plan in cost.");
		getCost();
	}
	
	/**
	 * method that overrides the one from superclass, gets the cost of room 
	 * @return cost - the cost as a double of the room
	 * **/
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 150;
		return cost;
	}
	/**
	 * string representation of the information of the small party room
	 * @return - a string
	 * **/
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}


