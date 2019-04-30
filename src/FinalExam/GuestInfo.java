package FinalExam;


public class GuestInfo extends MakeReservation{

	

	    private String name;
	    private String address;
	    private String phoneNum;
	    private String email;
	    private Card paymentMethod;

	  public GuestInfo(Date date, Rooms room) {
		super(date, room);
		// TODO Auto-generated constructor stub
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



	}



