package FinalExam;

import java.util.ArrayList;

public abstract class Rooms {

	protected int capacity;
	protected double cost;
	protected int numofRooms;
	protected Upgrades upgrades;
	protected String description;
	protected String includedCost;
	protected boolean isAvailable;
	protected ArrayList<MakeReservation> waitlist = new ArrayList<MakeReservation>();
	
	public Rooms() {
		capacity = 50;
		cost = 700.00;
		numofRooms = 10;
		upgrades = new Upgrades();
		description = "room with party tables, chairs and is next to arcade";
		includedCost = "table and chair set up, basic meal plan";
	}
	
	public Rooms(int cap, double c, int num, String describe, String ic) {
		capacity = cap;
		cost = c;
		numofRooms = num;
		description = describe;
		includedCost = ic;
	}
	
	abstract public String getDescription();
	
	public void setDescription(String describe) {
		description = describe;
	}
	
	public Upgrades getUpgrades(){
		return upgrades;
	}
	
	public void setUpgrades(Upgrades up) {
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
	
	abstract public double getCost();
	
	abstract public int getNumofRooms();
	
	public void setNumofRooms(int num) {
		numofRooms = num;
	}
	
	public void isAvaliable() {
		
	}
	
	public String toString() {
		return description;
	}
}
