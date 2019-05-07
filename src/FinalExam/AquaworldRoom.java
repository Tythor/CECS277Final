package FinalExam;

/**
 * @author audreybrio (group 6)
 * @release date - May 6, 2019
 * this class is a subclass of room and gets the information details of the aquaworld room
 * **/
public class AquaworldRoom extends Room{

	private String restrictions;
	private static AquaworldRoom aquaWorld = new AquaworldRoom(); //instance variables

	/**
	 * constructor method uses singleton design pattern
	 * **/
	public AquaworldRoom() {}

	/**
	 * method that creates new instance of itself
	 * @return aquaworld - a new aquaworld room
	 * **/

	public static AquaworldRoom getInstance() {

		if(aquaWorld == null) {

			aquaWorld = new AquaworldRoom();
		}

		return aquaWorld;
	}
	
	/**
	 * method that gets the information specific to aquaworld room
	 * @return a - a string of information about aquaworld room 
	 * **/
	public String newAquaworldRoom() {
		super.name = "Aquaworld Room";
		super.setCapacity(75);
		super.setDescription("Olympic-sized pool with water slide, kiddie pool, and large jacuzzi. Includes access to showers/lockers, life guards on duty, DJ, table & chair set-up, and basic meal plan in cost.");
		getRestrictions();
		getCost();
		String a = toString();
		return a;

	}

	/**
	 * method that sets what the restrictions of the aquaworld room are as a string
	 * @return restrictions - a string of the restrictions of the room
	 * **/
	public String getRestrictions() {
		restrictions = "To access water facilities, bathing suits must be worn at all times.";
		return restrictions;
	
	}
	/**
	 * method that overrides the one from superclass, gets the cost of room 
	 * @return cost - the cost as a double of the room
	 * **/
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 700;
		return cost;
	
	}
	/**
	 * string representation of the information of the aquaworld room 
	 * @return - a string
	 * **/
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nRestrictions: " + restrictions + "\nCost: $" + cost +" an hour");
	}
}


