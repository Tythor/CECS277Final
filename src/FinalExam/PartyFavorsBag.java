package FinalExam;

public class PartyFavorsBag extends Upgrades {

	private int numPartyFavorsBag;

	public void setNumPartyFavorsBag(int numPartyFavorsBag) {
		this.numPartyFavorsBag = numPartyFavorsBag;
	}

	public int getNumPartyFavorsBag() {
		return numPartyFavorsBag;
	}

	public double getCost() {

		return 5 * numPartyFavorsBag;
	}

}
