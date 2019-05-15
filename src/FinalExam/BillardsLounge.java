package FinalExam;

/**
 * @author audreybrio (group 6)
 * @release date - May 6, 2019
 * this class is a subclass of room and gets the information details of the billards lounge
 * **/

public class BillardsLounge extends Room{

	private String restrictions; //instance variables
	
	/**
	 * constructor that sets the information specific to the room
	 * **/
	public BillardsLounge() {
		super.name = "Billards Lounge";
		super.setCapacity(10);
		super.setDescription("Enclosed lounge with pool table. Includes access to pool table and cues in cost.\n");
		getRestrictions();
		getCost();
	}

	/**
	 * method that overrides the one from superclass, gets the cost of room 
	 * @return cost - the cost as a double of the room
	 * **/
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 25;
		return cost;
	}
	/**
	 * string representation of the information of the billards lounge 
	 * @return - a string
	 * **/
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nRestrictions: " + restrictions + "\nCost: $" + cost +" an hour");
	}
	
	/**
	 * method that sets what the restrictions of the billards lounge are as a string
	 * @return restrictions - a string of the restrictions of the room
	 * **/
	public String getRestrictions() {
		restrictions = "21+ only";
		return restrictions;
	}
}
