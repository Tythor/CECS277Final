package FinalExam;

public class SmallPartyRoom extends Rooms{
	
	

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		description  = "Room with party tables and chairs, adjacent to arcade";
		return description;
	}

	@Override
	public String getIncludedCost() {
		// TODO Auto-generated method stub
		includedCost = "table and chair set up, basic meal plan";
		return includedCost;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		capacity = 30;
		return capacity;
	}

	@Override
	public int getNumofRooms() {
		// TODO Auto-generated method stub
		numofRooms = 10;
		return numofRooms;
	}

}
