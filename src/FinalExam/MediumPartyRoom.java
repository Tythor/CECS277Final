package FinalExam;

public class MediumPartyRoom extends Rooms{

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		description = "Room with party tables and chairs, quick access to arcade";
		return description;
	}

	@Override
	public String getIncludedCost() {
		// TODO Auto-generated method stub
		includedCost = "table & chair set-up, DJ, Basic Meal Plan";
		return includedCost;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		capacity = 45;
		return capacity;
	}

	@Override
	public int getNumofRooms() {
		// TODO Auto-generated method stub
		numofRooms = 2;
		return numofRooms;
	}

}
