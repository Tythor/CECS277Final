package FinalExam;

import java.util.ArrayList;
import java.sql.Time;

public class ManageReservation {
    ArrayList<Room> log;
    boolean isFinalized;
    Date date;
    Room Room;

<<<<<<< HEAD
=======
    Time time;

>>>>>>> master
    public ManageReservation() {
    }

    public void update(GuestInfo x, Object y) {
        this.setDate((Date) y);
        this.setRoom((Room) y);
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }
<<<<<<< HEAD
=======

>>>>>>> master
}
