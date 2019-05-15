package FinalExam;

public class PartyDecorations extends Upgrades {


	private String theme;
<<<<<<< HEAD
	
	
	private Room th;
	
	PartyDecorations(Room th, String theme) {
		this.th = th;
		this.theme = theme;
	}
	
	
	/**
	 * 
	 * @return - the theme being set as a String, could be Hawaiian, Sea Life, Jungle, Space, or Modern Theme 
	 */
	
	public String getTheme() {
		return theme;
	}
  	
	
	/**
	 * @return $100.00, the fixed price for setting a theme to the room that the guests are renting 
	 */
	
	public double getCost() {
		
		//return 100.00 + th.getCost();
		return 100.00;
	}

	@Override
	public String getDescription() {
		//return getTheme() + " " + getCost() + " Getting a theme for the room";
		return th.getDescription() + getCost() + " Getting a theme for the room\nThe theme of the room is " + getTheme() + "\n";
=======

	/**
	 *
	 * @param theme - the theme being set to the the room that the guests are renting
	 */

	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 *
	 * @return - the theme being set as a String, could be Hawaiian, Sea Life, Jungle, Space, or Modern Theme
	 */

	public String getTheme() {
		return theme;
	}

	/*public String toString() {
		return theme;
	}*/


	/**
	 * @return $100.00, the fixed price for setting a theme to the room that the guests are renting
	 */

	public double getCost() {

		return 100.00;
>>>>>>> master
	}
}
