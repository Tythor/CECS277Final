package FinalExam;
import java.sql.Time;
import java.util.ArrayList;

public class GuestInfo {
	ArrayList<ManageReservation> manager_list;
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	private Card paymentMethod;
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


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public String getEmail() {
		return email;
	}


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
}




