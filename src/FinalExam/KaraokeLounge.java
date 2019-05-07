package FinalExam;

/**
 * @author audreybrio (group 6)
 * @release date - May 6, 2019
 * this class is a subclass of room and gets the information details of the karaoke lounge 
 * **/

public class KaraokeLounge extends Room{

	
	/**
	 * constructor that sets the information specific to the room
	 * **/
	public KaraokeLounge() {
		super.name = "Karaoke Lounge";
		super.setCapacity(10);
		super.setDescription("Enclosed lounge with karaoke machine. Includes access to karaoke machine in cost.");
		getCost();
	}
	
	/**
	 * method that overrides the one from superclass, gets the cost of room 
	 * @return cost - the cost as a double of the room
	 * **/
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 30;
		return cost;
	}
	/**
	 * string representation of the information of the karaoke lounge
	 * @return - a string
	 * **/
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}
