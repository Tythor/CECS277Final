package FinalExam;

import java.util.ArrayList;

public class ManageReservation {
    ArrayList<Room> log;
    boolean isFinalized;
    Date date;
    Room Room;

    public ManageReservation() {
    }
    void update() {

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
