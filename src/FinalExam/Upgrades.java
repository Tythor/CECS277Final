package FinalExam;

import java.util.ArrayList;

public class Upgrades extends Room {
	
	protected static ArrayList<Upgrades> ameneties = new ArrayList<Upgrades>(); 
	
	//Upgrades u = new Upgrades();
	
	String choice;
	
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
	
	public static void displayAmeneties() {
		
		int i;
		
		for(i = 0; i < ameneties.size(); i++) {
			System.out.println(ameneties.get(i));
		}
	}
	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
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
	

	
	
}
