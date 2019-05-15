package FinalExam;

public class PartyFavorsBag extends Upgrades {

<<<<<<< HEAD
	private Room partyBags;
	
	PartyFavorsBag(Room partyBags, int numBags) {
		
		this.partyBags = partyBags;
		super.quantity = numBags;
	}
	
	
	public String getDescription() {
		return partyBags.getDescription() + getCost() + " Getting Party Favor Bags\n";
	}
	
	
	/**
	 * @return the total price of the party favors bag, which is 5 * the number of party favors bag
	 */
	
	public double getCost() {
		
		//return (5 * numPartyFavorsBag) + partyBags.getCost();
		return 5 * super.quantity;
=======
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
>>>>>>> master
	}

}

