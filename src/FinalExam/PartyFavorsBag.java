package FinalExam;

public class PartyFavorsBag extends Upgrades {

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
	}
	
}

