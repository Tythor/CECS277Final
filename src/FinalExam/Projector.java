package FinalExam;

public class Projector extends Upgrades {

	private Room room; // There a projector in a room
	
	private int hourlyRate;
	
	public double getCost() {
		
		return 10 * hourlyRate;
	}
}
