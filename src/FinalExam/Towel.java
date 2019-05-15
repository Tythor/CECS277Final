package FinalExam;

public class Towel extends Upgrades {

	private Room waterPark;
	
	/**
	 * 
	 * @param waterPark - the aquaworld being passed in as a room object
	 * @param numTowels - the number of towels as an integer
	 */
	
	Towel(Room waterPark, int numTowels) {
		
		this.waterPark = waterPark;
		super.quantity = numTowels;
	}

	/**
	 * @return ...
	 */
	
	@Override
	public String getDescription() {
		return waterPark.getDescription() + "Renting " +  super.quantity +  " towels";
	}
	
	public double getCost() {
		
		return 2 * super.quantity;
	}
	
}
