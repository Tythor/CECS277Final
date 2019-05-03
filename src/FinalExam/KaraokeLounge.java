package FinalExam;

public class KaraokeLounge extends Room{

	
	
	public KaraokeLounge() {
		super.name = "Karaoke Lounge";
		super.setCapacity(10);
		super.setDescription("Enclosed lounge with karaoke machine. Includes access to karaoke machine in cost.");
		getCost();
	}
	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 30;
		return cost;
	}
	
	public String toString() {
		return(name + ": \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
}
