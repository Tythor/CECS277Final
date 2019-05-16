package FinalExam;

import java.sql.Time;

public class Reservation extends abstract_reserv{
    protected Date date;
    private Time startTime;
    private Time endTime;
    protected Room room;
    private GuestInfo guest;
    private Card card;
    private boolean isFinalized;

    public Reservation(Date date, Time startTime, Time endTime, Room room, GuestInfo guest, Card card) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.guest = guest;
        this.card = card;
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

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void finalizeReservation(boolean new_state) {
        isFinalized = new_state;
        notify();
    }

    public void Update() {
        System.out.println("A reservation has been finalized!");
    }
    
    public String toString() {
    	return "Room: " + room + "\nDate: " + date + "\nStart Time: " + startTime + "\nEnd Time: " + endTime + "\nGuest Info: " + guest + "Card Info "+ card;
    }
}
