package FinalExam;

public class Projector extends Upgrades {

	private Room room; // There a projector in a room

	private int hourlyRate;


	/**
	 *
	 * @param hourlyRate - the number of hours that is willing to be set as an integer.
	 * The number of hours that guests are renting the projector
	 */

	public void setHour(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 *
	 * @return - the number of hours of the projector being rented as an integer.
	 */

	public int getHour() {
		return hourlyRate;
	}


	/**
	 * @return the cost of the projector, which is $10 * the number of hours that the projector is being rented
	 */

	public double getCost() {

		return 10 * hourlyRate;
	}
}
