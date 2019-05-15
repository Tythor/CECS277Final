package FinalExam;

import java.util.ArrayList;

public class waitListTemp {

	
	protected ArrayList<MakeReservation> waitlist;
	
	public waitListTemp() {
		waitlist = new ArrayList<>();
	}
	public void setNewGuest(MakeReservation people) {
		waitlist.add(people);
	}
	
	public ArrayList<MakeReservation> getGuests() {
		return waitlist;
	}
	
}
