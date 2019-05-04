package FinalExam;

public class PartyDecorations extends Upgrades {

	
	private String theme;
	
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getTheme() {
		return theme;
	}
  	
	/*public String toString() {
		return theme;
	}*/
	
	public double getCost() {
		
		return 100;
	}
}
