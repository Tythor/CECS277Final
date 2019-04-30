package FinalExam;

public class BillardsLounge extends Rooms {

	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		description = "enclosed lounge with pool table";
		return description;
	}

	@Override
	public String getIncludedCost() {
		// TODO Auto-generated method stub
		includedCost = "access to pool tables and cues";
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
		numofRooms = 5;
		return numofRooms;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
