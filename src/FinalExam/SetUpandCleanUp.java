package FinalExam;


/**
 * @author (group 6)
 * @release date - May 6, 2019
 * this class creates a basic room
 * **/

public class SetUpandCleanUp {
	
	private double startTime;
	private double endTime;
	public double setUp;
	private double cleanUp; //instance variables
	
	
	/**
	 * method that gets time of reservation and time for clean up and set up
	 * @param room - string name of room
	 * @param s - start time of party as a double
	 * @param e -end time of party as a double 
	 * **/
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