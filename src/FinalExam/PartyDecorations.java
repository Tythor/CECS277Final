package FinalExam;

public class PartyDecorations extends Upgrades {

	
	private String theme;
	
	PartyDecorations(String theme) {
		
		this.theme = theme;
	}
	
	
	public String toString() {
		return theme;
	}
	
	public double getCost() {
		
		return 100;
	}
}
