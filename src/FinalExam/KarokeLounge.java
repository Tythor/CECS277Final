package FinalExam;

public class KarokeLounge extends Room{

	
	
	public KarokeLounge() {
		super.setCapacity(10);
		super.setDescription("Enclosed lounge with karaoke machine. Includes access to karoke machine in cost.");
		getCost();
	}
	
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		cost = 30;
		return cost;
	}
	
	public String toString() {
		return("Karoke Lounge: \nCapacity: " + capacity + " people \nDescription: " + description + "\nCost: $" + cost +" an hour");
	}
		
		
		
		
public static void main(String[] args) {
		KarokeLounge a = new KarokeLounge();
		System.out.println(a);
	}

}
