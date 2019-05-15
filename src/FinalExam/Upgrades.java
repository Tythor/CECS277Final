package FinalExam;

<<<<<<< HEAD
public abstract class Upgrades extends Room {
	
	protected int quantity; //this represents # hours in Projector
	
	// # towels in Towels
	
	// # bags in FavorBags
	
	// the theme in PartyDecorations
	
	
	/**
	 * 
	 * @param quantity - the number of a certain item as an integer
	 * Representing the number of towels, favorBags, and the number of hours of the projector being used
	 */
	
	public void setQty(int quantity) {
		this.quantity = quantity;
	}
	
	// Get and Set Quantity - Bags
	// Towels
	// Hours
	
	/**
	 * 
	 * @return quantity - the number as an integer
	 */
	
	public int getQty() { 
		
		return quantity;
		
	}
	
	/**
	 * @return ...
	 */
	
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	
	public abstract String getDescription(); // abstract method
	
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
	
=======
import java.util.ArrayList;

public class Upgrades extends Room {

	protected static ArrayList<Upgrades> ameneties = new ArrayList<Upgrades>();

	//Upgrades u = new Upgrades();

	String choice;


	/**
	 *
	 * @param choice - the choices that the user can choose from is the projector, party decorations, and party favors bag
	 * as a String
	 * After that, the choices will be added to an the amenities ArrayList<Upgrades>.
	 * Note that, there can MORE than ONE upgrade, if desired
	 */

	public static void setAmeneties(String choice) {
		if (choice == "Projector") {
			Projector p = new Projector();
			//u.setUpgrades(p);
			ameneties.add(p);

		}

		if (choice == "Party Decorations") {
			PartyDecorations pd = new PartyDecorations();
			//u.setUpgrades(pd);
			ameneties.add(pd);
		}

		if (choice == "Party Favors Bag") {
			PartyFavorsBag pb = new PartyFavorsBag();
			//u.setUpgrades(pb);
			ameneties.add(pb);
		}

	}

	/**
	 * Displays the upgrades that the customer has selected when booking the room
	 */

	public static void displayAmeneties() {

		int i;

		for(i = 0; i < ameneties.size(); i++) {
			System.out.println(ameneties.get(i));
		}
	}


	@Override

	/**
	 * @return
	 */

	public double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	// Testing the Upgrade Decorator Pattern Setter and Getter Methods

	public static void main (String [] args) {

		Projector p = new Projector();

		p.setHour(2);
		System.out.println(p.getCost());

		PartyDecorations pd = new PartyDecorations();

		pd.setTheme("Sea Life"); // Setting the theme into the Party Decorations

		System.out.println(pd.getTheme());

		PartyFavorsBag pf = new PartyFavorsBag();

		pf.setNumPartyFavorsBag(5);

		System.out.println(pf.getCost());


	}




>>>>>>> master
}
