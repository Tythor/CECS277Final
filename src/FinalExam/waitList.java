package FinalExam;

import java.util.ArrayList;

public class waitList {
	
	protected static ArrayList<Reservation> aquaWaitList = new ArrayList<Reservation>();

	protected ArrayList<Reservation> smallPartyRoomWaitList = new ArrayList<Reservation>();
	
	protected ArrayList<Reservation> mediumPartyRoomWaitList = new ArrayList<Reservation>();
	
	protected ArrayList<Reservation> karoakeWaitList = new ArrayList<Reservation>();
	
	protected ArrayList<Reservation> billiardsWaitList = new ArrayList<Reservation>();
	
	public void addAQ(Reservation r) {
		aquaWaitList.add(r);
	}
	
	public void addSPR(Reservation r) {
		smallPartyRoomWaitList.add(r);
	}
	
	public void addMPR(Reservation r) {
		mediumPartyRoomWaitList.add(r);
	}
	public void addKL(Reservation r) {
		karoakeWaitList.add(r);
	}
	
	public void addBL(Reservation r) {
		billiardsWaitList.add(r);
	}
	
	public void removeAQ() {
		aquaWaitList.remove(0);
	}
	
	public void removeSPR() {
		smallPartyRoomWaitList.remove(0);
	}
	
	public void removeMPR() {
		mediumPartyRoomWaitList.remove(0);
	}
	public void removeKL() {
		karoakeWaitList.remove(0);
	}
	
	public void reoveBL() {
		billiardsWaitList.remove(0);
	}
	
	
	
//	public static void main(String [] args) {
//		System.out.println("Stand by");
//		
//		Date testDate = new Date(3, 22, 2018);
//		
//		Room testRoom = new AquaworldRoom();
//		
//		//System.out.println(testDate);
//		
//		//System.out.println(testRoom);
//		
//		aquaWaitList = new ArrayList<>();
//		
//		//aquaWaitList.add(new Reservation(testDate, null, null, testRoom, null, null));
//		
//		for(int i = 0; i < aquaWaitList.size(); i++) {
//			System.out.println(aquaWaitList.get(i));
//		}
//	}

}
