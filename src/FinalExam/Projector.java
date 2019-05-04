package FinalExam;

public class Projector extends Upgrades {

	private Room room; // There a projector in a room
	
	private int hourlyRate;
	
	
	public void setHour(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public int getHour() {
		return hourlyRate;
	}
	
	
	public double getCost() {
		
		return 10 * hourlyRate;
	}
}
