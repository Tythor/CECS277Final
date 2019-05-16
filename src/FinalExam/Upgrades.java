package FinalExam;

public abstract class Upgrades extends Room {
	
	protected int quantity; //this represents # hours in Projector
	// # towels in Towels
	// # bags in FavorBags
	// the theme in PartyDecorations
	
	
	public void setQty(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQty() {return quantity;}
	
	/**
	 * @return 
	 */
	
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	// Get and Set Quantity - Bags
	// Towels
	// Hours
	
	
	public abstract String getDescription();
	
	// Testing the Upgrade Decorator Pattern Setter and Getter Methods
	
	/*public static void main (String [] args) {
			
		Projector p = new Projector();
		
		p.setHour(2);
		System.out.println(p.getCost());
		
		PartyDecorations pd = new PartyDecorations();
		
		pd.setTheme("Sea Life"); // Setting the theme into the Party Decorations
		
		System.out.println(pd.getTheme());
		
		PartyFavorsBag pf = new PartyFavorsBag();
		
		pf.setNumPartyFavorsBag(5);
		
		System.out.println(pf.getCost());
		
				
	} */
	
}
