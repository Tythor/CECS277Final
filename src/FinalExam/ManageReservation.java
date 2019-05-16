package FinalExam;

import java.util.ArrayList;
import java.sql.Time;

//public class ManageReservation extends Reservation {
public class ManageReservation {

	static ArrayList<Reservation> reservations = new ArrayList<>();
    ArrayList<Room> log;
    boolean isFinalized;
    Date date;
    Room Room;
    Time startTime;
    Time endTime;
    
    public ManageReservation() {
    	//super(date, room);
    }

//    public void update(GuestInfo x, Object y) {
//        this.setDate((Date) y);
//        this.setRoom((Room) y);
//    }

    public void Notify() {
        for (Reservation r : reservations) {
            r.Update();
        }
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

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void getEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }

    public int addReservation(Reservation reservation) {
        reservations.add(reservation);
        return reservations.size();
    }
    
    public boolean checkAvailable(Date d, Time sT, Time eT, String name) {
        //boolean flag = true;
        //Reservation r = new Reservation();
        /*startTime = sT;
        endTime = eT;
        date = d;*/
        System.out.println(reservations.size());
    	for(Reservation reservation : reservations) {
            /*System.out.println("Start Time: " + reservation.getStartTime() + "  " + sT);
            System.out.println(reservation.getStartTime().equals(sT));
            System.out.println("Name: " + reservation.getRoom().getName() + " " + name);
            System.out.println(reservation.getRoom().getName().equals(name));
            System.out.println("Date: " + reservation.getDate() + " " + d);
            System.out.println(reservation.getDate() == d);
            System.out.println(reservation.getDate().toString().equals(d.toString()));*/

            if (reservation.getRoom().getName().equals(name)) {
                if (reservation.getDate().toString().equals(d.toString())) {
                    System.out.println("Reservation");
                    if (reservation.getStartTime().before(sT) && reservation.getEndTime().after(sT)) {
                        return false;
                    }
                    if (reservation.getEndTime().after(eT) && reservation.getEndTime().before(eT)) {
                        return false;
                    }
                    if (reservation.getStartTime().equals(sT) || reservation.getEndTime().equals(eT)) {
                        return false;
                    }
                }
            }
    	}
    	return true;
    }
}
