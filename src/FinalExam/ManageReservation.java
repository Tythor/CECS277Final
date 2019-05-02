package FinalExam;

public class ManageReservation {
    boolean isFinalized;
    Date date;
    Room Room;
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

    public Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }
}
