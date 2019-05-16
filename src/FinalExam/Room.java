package FinalExam;

import java.sql.Time;
import java.util.ArrayList;

/**
 * @author (group 6)
 * @release date - May 6, 2019
 * this class creates a basic room
 * **/

public class Room {
	
	protected String name;
	protected int capacity;
	protected double cost;
	protected Upgrades upgrades;
	protected String description;
	protected boolean isAvailable;
	protected Date date;
	protected MealPlans Meal;
	protected ArrayList<Reservation> waitlist = new ArrayList<>(); //instance variables

	private int month;
	
	/**
	 * default constructor
	 * **/
	public Room() {
		name = "Small Party Room";
		capacity = 50;
		cost = 700.00;
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
	public double getCost() {
		return 0;
	}
	
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
	public void addToWaitlist(Reservation reservation) {
	    waitlist.add(reservation);
	    System.out.println("Added " + reservation + " to the waitlist");
    }

	/**
	 * method that removes person to waitlist
	 * @param reservation - takes in the reservation info of person and removes them from the waitlist
	 * **/
    public void removeFromWaitlist(Reservation reservation) {
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
	public boolean isAvaliable(String a, int b, int c, String e, String f, String g) {
		if(a.equals("January")) {
			 month = 1;
		}
		if(a.equals("February")) {
			month = 2;
		}
		if(a.equals("March")) {
			 month = 3;
		}
		if(a.equals("April")) {
			month = 4;
		}
		if(a.equals("May")) {
			 month = 5;
		}
		if(a.equals("June")) {
			 month = 6;
		}
		if(a.equals("July")) {
			 month = 7;
		}
		if(a.equals("August")) {
			month = 8;
		}
		if(a.equals("September")) {
			 month = 9;
		}
		if(a.equals("October")) {
			 month = 10;
		}
		if(a.equals("November")) {
			 month = 11;
		}
		if(a.equals("December")) {
			month = 12;
		}
		Date date = new Date();
		date.setMonth(month);
		date.setDay(b);
		date.setYear(c);
		
		String hourS = e.substring(0, 2);
		String hourE = f.substring(0, 2);
		String minuteS = e.substring(3, 5);
		String minuteE = f.substring(3, 5);
		int startH = Integer.parseInt(hourS);
		int startM = Integer.parseInt(minuteS);
		int endH = Integer.parseInt(hourE);
		int endM = Integer.parseInt(minuteE);
		Time timeS = new Time(startH, startM, 0);
		Time timeE = new Time(endH, endM, 0);
		System.out.println(timeS);
		System.out.println(date);

		ManageReservation manageReservation = new ManageReservation();
		isAvailable = manageReservation.checkAvailable(date, timeS, timeE, name);

		if (isAvailable) {

		}

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

