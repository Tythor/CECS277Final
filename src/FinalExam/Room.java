package FinalExam;

import java.util.ArrayList;
/**
 * @author audreybrio (group 6)
 * @release date - May 6, 2019
 * this class creates a basic room
 * **/

public abstract class Room {
	
	protected String name;
	protected int capacity;
	protected double cost;
	protected Upgrades upgrades;
	protected String description;
	protected boolean isAvailable;
	protected Date date;
	protected MealPlans Meal;
	//protected ArrayList<MakeReservation> waitlist = new ArrayList<MakeReservation>();
	protected ArrayList<MakeReservation> waitlist = new ArrayList<>(); //instance variables
	
	/**
	 * default constructor
	 * **/
	public Room() {
		name = "Small Party Room";
		capacity = 50;
		cost = 700.00;
		//upgrades u = new Upgrades();
		//description = "room with party tables, chairs and is next to arcade\n";
		description = "room with party tables, chairs and is next to arcade";

	}
	
	/**
	 * constructor that allows you to create new room
	 * @param name - String of what the name of the room is
	 * @param capacity - int value of the total number of people the room can hold
	 * @param description - string value of info about the room and what is included in the cost
	 * **/
	public Room(String name, int capacity, String description) {
		this.name = name;
		this.capacity = capacity;
		this.cost = getCost();
		this.description = description;
	}
	
	/**
	 * method that gets name of room
	 * @return name - String of what the name of room is
	 * **/
	public String getName() {
		return name;
	}
	
	/**
	 * method that sets name of room
	 * @param n - String of the name of room
	 * **/
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * method that gets description of room
	 * @return name - String of what the description of room is
	 * **/
	public String getDescription() {
		return description;
	}
	
	/**
	 * method that sets description of room
	 * @param describe - String of the description of room
	 * **/
	public void setDescription(String describe) {
		description = describe;
	}
	
	/**
	 * method that allows you to get upgrades for a room
	 * @return upgrades - String of what the upgrades of the room are
	 * **/
	public Upgrades getUpgrades(){
		return upgrades;
	}
	
	/**
	 * method that sets upgrades of room
	 * @param up - String of the upgrades of room
	 * **/
	public void setUpgrades(Upgrades up) {
		upgrades = up;
	}
	
	/**
	 * method that gets capacity of room
	 * @return capacity - String of what the capacity of room is
	 * **/
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * method that sets capacity of room
	 * @param cap - String of the capacity of room
	 * **/
	public void setCapacity(int cap) {
		capacity = cap;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date d) {
		date = d;
	}
	/**
	 * abstract method that gets overridden, gets the cost for each room
	 * **/
	abstract public double getCost();
	
	/**
	 * method that alows you to upgrade a meal plan
	 * @param P - mealplan that you want to upgrade to
	 * **/
	public void upgradeMealPlan(MealPlans P) {
		
	}
	
	/**
	 * method that adds person to waitlist
	 * @param reservation - takes in the reservation info of person and adds them to the waitlist
	 * **/
	public void addToWaitlist(MakeReservation reservation) {
	    waitlist.add(reservation);
	    System.out.println("Added " + reservation + " to the waitlist");
    }

	/**
	 * method that removes person to waitlist
	 * @param reservation - takes in the reservation info of person and removes them from the waitlist
	 * **/
    public void removeFromWaitlist(MakeReservation reservation) {
        waitlist.remove(reservation);
        System.out.println("Removed " + reservation + " from the waitlist");
    }
    
    /**
     * method that allows you to contact guest
     **/
    public void contactGuest() {

    }
	
    /**
     * method that allows you to see if a room is available based on date
     * @param date - takes in the date that you want
     * @return isAvailable - boolean of whether or not the date is available
     * **/
	public boolean isAvaliable(Date date) {
	    return isAvailable;
	}
	
	
	public void Notify() {
		//notifies reservaiton when someone checks out/is removed
	}
	/**
	 * string representation of the information of room that gets overridden
	 * @return - a string
	 * **/
	public String toString() {
		return description;
	}
	
}
