package FinalExam;

import java.util.ArrayList;

public class waitList {
	
	protected static ArrayList<MakeReservation> aquaWaitList;

	protected ArrayList<MakeReservation> smallPartyRoomWaitList;
	
	protected ArrayList<MakeReservation> mediumPartyRoomWaitList;
	
	protected ArrayList<MakeReservation> karoakeWaitList;
	
	protected ArrayList<MakeReservation> billiardsWaitList;
	
	waitList(ArrayList<MakeReservation> aquaWaitList, ArrayList<MakeReservation> smallPartyRoomWaitList, ArrayList<MakeReservation> mediumPartyRoomWaitList, ArrayList<MakeReservation> karaokeWaitList, ArrayList<MakeReservation> billiardsWaitList) {
		
		aquaWaitList = new ArrayList<>();
		this.mediumPartyRoomWaitList = mediumPartyRoomWaitList;
		this.smallPartyRoomWaitList = smallPartyRoomWaitList;
		this.karoakeWaitList = karaokeWaitList;
		this.billiardsWaitList = billiardsWaitList;
	}
	
	
	
	public static void main(String [] args) {
		System.out.println("Stand by");
		
		Date testDate = new Date(3, 22, 2018);
		
		Room testRoom = new AquaworldRoom();
		
		//System.out.println(testDate);
		
		//System.out.println(testRoom);
		
		aquaWaitList = new ArrayList<>();
		
		aquaWaitList.add(new MakeReservation(testDate, testRoom));
		
		for(int i = 0; i < aquaWaitList.size(); i++) {
			System.out.println(aquaWaitList.get(i));
		}
	}

}
