package FinalExam;

public class Projector extends Upgrades {

	private Room room; // There a projector in a room

	
	
	Projector(Room room, int numHours) {
		this.room = room;
		super.quantity = numHours;
	}
	
	
	public String getDescription() {
		return room.getDescription() + getCost() + " Getting Projector\n"; 
	}
	
	/**
	 * 
	 * @param numHours - the number of hours that is willing to be set as an integer.
	 * The number of hours that guests are renting the projector
	 */
	

	

	
	
	/**
	 * @return the cost of the projector, which is $10 * the number of hours that the projector is being rented
	 */
	
	public double getCost() {
		
		//return (10 * numHours) + room.getCost();
		return 10 * super.quantity;
	}
}



