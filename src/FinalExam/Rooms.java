package FinalExam;

public abstract class Rooms {

	protected int capacity;
	protected int cost;
	protected int numofRooms;
	protected String upgrades;
	protected String description;
	protected String includedCost;
	
	public Rooms() {
		capacity = 50;
		cost = 700;
		numofRooms = 10;
		upgrades = "none";
		description = "room with party tables, chairs and is next to arcade";
		includedCost = "table and chair set up, basic meal plan";
	}
	
	public Rooms(int cap, int c, int num, String up, String describe, String ic) {
		capacity = cap;
		cost = c;
		numofRooms = num;
		upgrades = up;
		description = describe;
		includedCost = ic;
	}
	
	abstract public String getDescription();
	
	public void setDescription(String describe) {
		description = describe;
	}
	
	public String getUpgrades(){
		return upgrades;
	}
	
	public void setUpgrades(String up) {
		upgrades = up;
	}
	
	abstract public String getIncludedCost();
	
	public void setIncludedCost(String ic) {
		includedCost = ic;
	}
	
	abstract public int getCapacity();
	
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	abstract public int getCost();
	
	abstract public int getNumofRooms();
	
	public void setNumofRooms(int num) {
		numofRooms = num;
	}
	
	public String toString() {
		return description;
	}
}
