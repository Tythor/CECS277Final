package FinalExam;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Gets and sets all the info pertaining to guests in the room. It describes their
 * meal plans, name, address, phone number, email, paymentMethod, date, time, mealplan,
 * upgrade
 */
public class GuestInfo {
	ArrayList<ManageReservation> manager_list;
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	private Card paymentMethod;
<<<<<<< HEAD




    /**
     * constructor for the guestinfo.
     * @param date date of room
     * @param room the room itself
     */
	public GuestInfo(Date date, Room room) {

	}

    /**
     * this adds one manager to the list to notify
     * @param manager
     */
//	public void attach(ManageReservation manager) {
//		manager_list.add(manager);
//	}

//    /**
//     * this notifies the manager of any updates
//     */
//	public void notify_manager() {
//		for (ManageReservation manager: manager_list) {
//			manager.update();
//		}
//	}

    /**
     * sets the name of the guest.
     * @param name name of guest
     */
	public void setName(String name) {
		this.name = name;
		notify_manager();
	}

    /**
     * sets the address of the guest
     * @param address of guest
     */
	public void setAddress(String address) {
		this.address = address;
		notify_manager();
	}

    /**
     * sets the phone number of guest
     * @param phoneNum of Guest
     */
=======
	private Date date;
	private Time time;
	private MealPlans mealplan;
	private Upgrades upgrade;

	public GuestInfo(Date date, Room room) {

	}

	public void attach(ManageReservation manager) {
		manager_list.add(manager);
	}

	public void notify_manager() {

	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


>>>>>>> master
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

<<<<<<< HEAD
    /**
     * sets the Email of guest
     * @param email
     */
=======

>>>>>>> master
	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
    /**
     * sets the payment method of guest
     * @param paymentInfo of guest
     */
	public void setPaymentMethod(String paymentInfo) {
		this.paymentMethod = paymentMethod;
	}

	// Getter Methods

    /**
     * gets the upgrade of guest
     * @return name of guest
     */
=======
	public void setPaymentMethod(String paymentInfo) {
		this.paymentMethod = paymentMethod;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void setMealplan(MealPlans mealplan) {
		this.mealplan = mealplan;
	}

	public void setUpgrade(Upgrades upgrade) {
		this.upgrade = upgrade;
	}

	// Getter Methods

>>>>>>> master
	public String getName() {
		return name;
	}

<<<<<<< HEAD
    /**
     * gets the address of guest
     * @return address of guest
     */
=======

>>>>>>> master
	public String getAddress() {
		return address;
	}

<<<<<<< HEAD
    /**
     * gets the phone number of guest
     * @return phone number of guest
     */
=======
>>>>>>> master

	public String getPhoneNum() {
		return phoneNum;
	}

<<<<<<< HEAD
    /**
     * get the email of guest
     * @return email of guest
     */

=======
>>>>>>> master

	public String getEmail() {
		return email;
	}

<<<<<<< HEAD
    /**
     * get paymentMethod of guest
     * @return payment method of guest
     */
	public String getPaymentMethod() {
		return null;
	}
=======

	public String getPaymentMethod() {
		return null;
	}

	public Date getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}

	public MealPlans getMealplan() {
		return mealplan;
	}

	public Upgrades getUpgrade() {
		return upgrade;
	}
>>>>>>> master
}




