package FinalExam;

public class MakeReservation {
    private Date date;
    private Room room;
    private GuestInfo guest;
    private boolean isFinalized;
    
    

    public MakeReservation(Date date, Room room) {

    	this.date = date;
    	this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    public void setGuestInfo(GuestInfo guest) {
    	this.guest = guest;
    }
    
    public GuestInfo getGuestInfo() {
    	return guest;
    }

    public void finalizeReservation() {
    	this.isFinalized = true;
    }
}
