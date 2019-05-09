package FinalExam;

public class Towel extends Upgrades {

	private Room waterPark;
	
	Towel(Room waterPark, int numTowels) {
		
		this.waterPark = waterPark;
		super.quantity = numTowels;
	}

	@Override
	public String getDescription() {
		return waterPark.getDescription() + "Renting " +  super.quantity +  " towels";
	}
	
	public double getCost() {
		
		return 2 * super.quantity;
	}
	
}
