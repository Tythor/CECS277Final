package FinalExam;


public class AquaworldRoom extends Rooms{
	
	private String restrictions;

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		description = "Olympic-sized pool with water slide, kiddie pool, and large jacuzzi";
		return description;
	}

	@Override
	public String getIncludedCost() {
		// TODO Auto-generated method stub
		includedCost = "access to showers/lockers, life guards on duty, DJ, table & chair set-up, Basic Meal Plan";
		return includedCost;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		capacity = 75;
		return capacity;
	}

	@Override
	public int getNumofRooms() {
		// TODO Auto-generated method stub
		numofRooms = 1;
		return numofRooms;
	}
	
	public String getRestrictions() {
		restrictions = "To access water facilities, bathing suits must be worn at all times.";
		return restrictions;
	}

}
