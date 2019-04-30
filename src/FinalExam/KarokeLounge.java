package FinalExam;

public class KarokeLounge extends Rooms{

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		description = "enclosed lounge with karoke machine";
		return description;
	}

	@Override
	public String getIncludedCost() {
		// TODO Auto-generated method stub
		includedCost = "access to karoke machine";
		return includedCost;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		capacity = 10;
		return capacity;
	}

	@Override
	public int getNumofRooms() {
		// TODO Auto-generated method stub
		numofRooms = 10;
		return numofRooms;
	}

}
