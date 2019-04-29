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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String describe) {
		description = describe;
	}
	
	public String getUpgrades() {
		return upgrades;
	}
	
	public void setUpgrades(String up) {
		upgrades = up;
	}
	
	public String getIncludedCost() {
		return includedCost;
	}
	
	public void setIncludedCost(String ic) {
		includedCost = ic;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	abstract public int getCost();
	
	public int getNumofRooms() {
		return numofRooms;
	}
	
	public void setNumofRooms(int num) {
		numofRooms = num;
	}
	
	public String toString() {
		return description;
	}
}
