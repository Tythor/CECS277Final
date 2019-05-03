package FinalExam;

public class BillardsLounge extends Room{

	private String restrictions;

	public BillardsLounge() {
		super.name = "Billards Lounge";
		super.setCapacity(10);
		super.setDescription("Enclosed lounge with pool table. Includes access to pool table and cues in cost.");
		getRestrictions();
		getCost();
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 25;
		return cost;
	}

	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nRestrictions: " + restrictions + "\nCost: $" + cost +" an hour");
	}
	
	public String getRestrictions() {
		restrictions = "21+ only";
		return restrictions;
	}
}
