package FinalExam;


public class AquaworldRoom extends Room{

	private String restrictions;
	
	private static AquaworldRoom aquaWorld = new AquaworldRoom();

	/**
	 * Default Constructor 
	 */
	
	public AquaworldRoom() {}

	/**
	 * 
	 * @return - aquaWorld, the only instance of aquaWorld, representing the Singleton Pattern.
	 * Singleton - This design pattern is a creational pattern that ensures that only one instance of the class can ever be made
	 */
	
	public static AquaworldRoom getInstance() {

		if(aquaWorld == null) {

			aquaWorld = new AquaworldRoom();
		}

		return aquaWorld;
	}

	public String newAquaworldRoom() {
		super.setCapacity(75);
		super.setDescription("Olympic-sized pool with water slide, kiddie pool, and large jacuzzi. Includes access to showers/lockers, life guards on duty, DJ, table & chair set-up, and basic meal plan in cost.");
		getRestrictions();
		getCost();
		String a = toString();
		return a;

	}
	
	
	public String getDescription() {
		return "Olympic-sized pool with water slide, kiddie pool, and large jacuzzi. Includes access to showers/lockers, life guards on duty, DJ, table & chair set-up, and basic meal plan in cost.";
	}

	public String getRestrictions() {
		restrictions = "To access water facilities, bathing suits must be worn at all times.";
		return restrictions;
		}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 700;
		return cost;
		}

	public String toString() {
		return("Aquaworld Room: \nCapacity: " + capacity + " people \nDescription: " + description + "\nRestrictions: " + restrictions + "\nCost: $" + cost +" an hour");
	}
}


