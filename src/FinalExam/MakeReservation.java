package FinalExam;

import java.sql.Time;

/**
 * creates a reservation
 */
public class MakeReservation {
    boolean isFinalized;
    private Date start_date;
    private Date end_date;
    private Time start_time;
    private Time end_time;
    private Upgrades upgrade;
    GuestInfo guest;
    MealPlans mealplan;
    Upgrades upgrades;

    /**
     * gets un update when the guestinfo is updated.
     */
    public void update() {
        // GuestInfo.getPop();
    }

    /**
     * gets when the room is available.
     * @return yes or no
     */
    public boolean isFinalized() {
        return isFinalized;
    }

    /**
     * gets the start date
     * @return the start date
     */
    public Date getStart_date() {
        return start_date;
    }

    /**
     * sets the start date
     * @param start_date
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    /**
     * gets the end date
     * @return the end date
     */
    public Date getEnd_date() {
        return end_date;
    }

    /**
     * sets the end date
     * @param end_date
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    /**
     * gets the start time
     * @return the start time
     */
    public Time getStart_time() {
        return start_time;
    }

    /**
     * sets the start time
     * @param start_time
     */
    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    /**
     * gets the end time;
     * @return end time
     */
    public Time getEnd_time() {
        return end_time;
    }

    /**
     * sets the end time
     * @param end_time
     */
    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    /**
     * get mealplan
     * @return
     */
    public MealPlans getMealplan() {
        return mealplan;
    }

    /**
     * get mealplan
     * @return upgrades
     */
    public Upgrades getUpgrades() {
        return upgrades;
    }

    /**
     * sets the upgrades
     * @param upgrades
     */
    public void setUpgrades(Upgrades upgrades) {
        this.upgrades = upgrades;
    }

    /**
     * sets mealplan
     * @param mealplan
     */
    public void setMealplan(MealPlans mealplan) {
        this.mealplan = mealplan;
    }

    /**
     * sets guest info
     * @return guest info
     */
    public GuestInfo getGuest() {
        return guest;
    }

    /**
     * sets guest
     * @param guest
     */
    public void setGuest(GuestInfo guest) {
        this.guest = guest;
    }
}

