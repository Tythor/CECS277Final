package FinalExam;

public class Time {
	
	private double startTime;
	private double endTime;
	public double setUp;
	private double cleanUp;
	
	
	public void makeReservation(String room, double s, double e) {
		startTime = s;
		endTime = e;
		if(room.equals("Aquaworld Room") || room.equals("Medium Party Room")) {
			setUp = startTime - 1;
			cleanUp = endTime + 1;
		}
		if(room.equals("Small Party Room")) {
			setUp = startTime - 0.5;
			cleanUp = endTime + 0.5;
			
		}
		if(room.equals("Karaoke Lounge") || room.equals("Billards Lounge")) {
			setUp = startTime - 0.25;
			cleanUp = endTime + 0.25;
		}
	}

}
