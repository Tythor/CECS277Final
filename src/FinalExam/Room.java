package FinalExam;

import java.util.ArrayList;

public abstract class Room {
	
	protected String name;
	protected int capacity;
	protected double cost;
	protected Upgrades upgrades;
	protected String description;
	protected boolean isAvailable;
	protected MealPlans Meal;
	protected ArrayList<MakeReservation> waitlist = new ArrayList<>();
	
	public Room() {
		name = "Small Party Room";
		capacity = 50;
		cost = 700.00;
		description = "room with party tables, chairs and is next to arcade";

	}
	
	public Room(String name, int capacity, String description) {
		this.name = name;
		this.capacity = capacity;
		this.cost = getCost();
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
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
	public void addToWaitlist(MakeReservation reservation) {
	    waitlist.add(reservation);
	    System.out.println("Added " + reservation + " to the waitlist");
    }

    public void removeFromWaitlist(MakeReservation reservation) {
        waitlist.remove(reservation);
        System.out.println("Removed " + reservation + " from the waitlist");
    }
    public void contactGuest() {

    }
	
	public boolean isAvaliable(Date date) {
	    return isAvailable;
	}
	
	public String toString() {
		return description;
	}
}
