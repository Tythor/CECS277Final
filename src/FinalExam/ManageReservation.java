package FinalExam;

public class ManageReservation {
    boolean isFinalized;
    Date date;
    Rooms Room;
    public ManageReservation() {
    }

    public boolean isFinalized() {
        return isFinalized;
    }

    public void setFinalized(boolean finalized) {
        isFinalized = finalized;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Rooms getRoom() {
        return Room;
    }

    public void setRoom(Rooms room) {
        Room = room;
    }
}
