package FinalExam;

import java.util.ArrayList;

public abstract class Room {

	protected int capacity;
	protected double cost;
	protected Upgrades upgrades;
	protected String description;
	protected boolean isAvailable;
	protected MealPlans Meal;
	protected ArrayList<MakeReservation> waitlist = new ArrayList<MakeReservation>();
	
	public Room() {
		capacity = 50;
		cost = 700.00;
		//upgrades = new Upgrades();
		description = "room with party tables, chairs and is next to arcade";

	}
	
	public Room(int cap, double c, String describe) {
		capacity = cap;
		cost = c;
		description = describe;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String describe) {
		description = describe;
	}
	
	public Upgrades getUpgrades(){
		return upgrades;
	}
	
	public void setUpgrades(Upgrades up) {
		upgrades = up;
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	abstract public double getCost();
	
	public void upgradeMealPlan(MealPlans P) {
		
	}
	
	public void isAvaliable() {
	}
	
	public String toString() {
		return description;
	}
}
