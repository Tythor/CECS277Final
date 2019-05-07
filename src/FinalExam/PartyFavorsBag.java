package FinalExam;

public class PartyFavorsBag extends Upgrades {

	private int numPartyFavorsBag;


	/**
	 *
	 * @param numPartyFavorsBag - the number of party favor bags being set an as integer.
	 */

	public void setNumPartyFavorsBag(int numPartyFavorsBag) {
		this.numPartyFavorsBag = numPartyFavorsBag;
	}

	/**
	 *
	 * @return - the number of party favors bag that is being purchased per party as an integer
	 */

	public int getNumPartyFavorsBag() {
		return numPartyFavorsBag;
	}

	/**
	 * @return the total price of the party favors bag, which is 5 * the number of party favors bag
	 */

	public double getCost() {

		return 5 * numPartyFavorsBag;
	}

}
