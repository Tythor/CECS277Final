package FinalExam.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

import FinalExam.*;
import FinalExam.Factory.*;

public class NewReservationFrame implements ActionListener {

	private JTextField firstName, lastName, phoneNumber, address, dob, email, cardName, cardNumber, cardCode, expDate;
	private JLabel guestInfo, cardInfo, contact, cardType, fn, ln, pn, ad, db, em, cname, cnum, ccode, edate, roomDetail, roomNumber, date, startTime, endTime, mealPlanDetail, error;
	private JCheckBox phoneBox, emailBox;
	private JComboBox roomTypes, mealPlans, pizzaToppings, sodaChoices,  soda2, soda3, soda4, soda5,
			toppings2, toppings3, toppings4, wingType, wingFlavors, wingFlavors2, iceCreamFlavors, iceCreamFlavors2, side,
			cardCompanies;
	private JButton save, cancel;

	private Date rDate;
	private Time rStartTime;
	private Time rEndTime;
	private JLabel roomName;
	private JLabel ageError;

	private ManageReservation manageReservation = new ManageReservation();

	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;

	private JPanel newPanel;
	private JFrame newReservationFrame = new JFrame();

	private String[] roomTypesList = {"Aqua World", "Small Party Room", "Medium Party Room", "Karaoke Lounge", "Adult Billiards " +
			"Lounge"};
	private String[] mealPlansList = {"Basic Meal Plan", "Bronze Meal Plan", "Silver Meal Plan", "Gold Meal Plan", "Platinum Meal " +
			"Plan"};
	private String[] pizzaToppingsList = {"Cheese", "Pepperoni", "Ham", "Jalapeno", "Sausage", "Mushroom", "Pineapple", "Bell Pepper",
			"Onion", "Garlic Chicken"};
	private String[] wingFlavorsList = {"Mild Spicy", "Diablo", "Lemmon Pepper", "BBQ", "Sesame"};
	private String[] wingTypesList = {"Bone-In", "Boneless"};
	private String[] iceCreamFlavorsList = {"Chocolate Fudge", "Vanilla Bean", "Strawberry Shortcake", "Choco-Mint", "Butter Pecan"};
	private String[] sodaChoicesList = {"Coca-Cola", "Diet Coke", "Canada Dry", "Orange Crush", "Squirt", "Root Beer"};
	private String[] sidesList = {"salad", "breadsticks"};
	private String[] companyList = {"Visa", "Mastercard", "American Express"};

	public NewReservationFrame() {
		createComponents();
		newReservationFrame.setVisible(true);
		newReservationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newReservationFrame.setTitle("New Reservation");
		newReservationFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		newReservationFrame.setLocationRelativeTo(null);
		newReservationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public NewReservationFrame(Date date, Time startTime, Time endTime, String roomName) {
		rDate = date;
		rStartTime = startTime;
		rEndTime = endTime;
		this.roomName = new JLabel(roomName);

		System.out.println("Printing..." + rDate.toString() + rStartTime.toString() + rEndTime.toString());

		createComponents();
		newReservationFrame.setVisible(true);
		newReservationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newReservationFrame.setTitle("New Reservation");
		newReservationFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		newReservationFrame.setLocationRelativeTo(null);
		newReservationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void createComponents() {
		newPanel = new JPanel();

		guestInfo = new JLabel("Guest Information: ");
		fn = new JLabel("First Name: ");
		ln = new JLabel("Last Name: ");
		pn = new JLabel("Phone Number: ");
		ad = new JLabel("Address: ");
		db = new JLabel("Date of Birth: ");
		em = new JLabel("Email: ");
		cardInfo = new JLabel("Card Information: ");
		cname = new JLabel("Card Name: ");
		cnum = new JLabel("Card Number: ");
		ccode = new JLabel("Security Code: ");
		edate = new JLabel("Expiration Date: ");

		firstName = new JTextField(25);
		lastName = new JTextField(25);
		phoneNumber = new JTextField(20);
		address = new JTextField(40);
		dob = new JTextField(15);
		email = new JTextField(45);
		cardName = new JTextField(20);
		cardNumber = new JTextField(17);
		cardCode = new JTextField(5);
		expDate = new JTextField(15);

		contact = new JLabel("Contact By: ");
		phoneBox = new JCheckBox("Phone");
		emailBox = new JCheckBox("Email");

		cardType = new JLabel("Select Card Type: ");
		cardCompanies = new JComboBox(companyList);

		roomDetail = new JLabel("Room Details: ");
		//roomTypes = new JComboBox(roomTypesList);
		roomNumber = new JLabel();
		date = new JLabel(rDate.toString());
		startTime = new JLabel(rStartTime.toString());
		endTime = new JLabel(rEndTime.toString());

		mealPlanDetail = new JLabel("Meal Plan Details: ");
		mealPlans = new JComboBox(mealPlansList);
		pizzaToppings = new JComboBox(pizzaToppingsList);
		sodaChoices = new JComboBox(sodaChoicesList);

		save = new JButton("Save");
		cancel = new JButton("Cancel");
		error = new JLabel("Error: Fill all fields");
		ageError = new JLabel("Error: Too young");

		newPanel.add(guestInfo);
		newPanel.add(fn);
		newPanel.add(firstName);
		newPanel.add(ln);
		newPanel.add(lastName);
		newPanel.add(pn);
		newPanel.add(phoneNumber);
		newPanel.add(ad);
		newPanel.add(address);
		newPanel.add(db);
		newPanel.add(dob);
		newPanel.add(em);
		newPanel.add(email);

		newPanel.add(cardInfo);
		newPanel.add(cname);
		newPanel.add(cardName);
		newPanel.add(cnum);
		newPanel.add(cardNumber);
		newPanel.add(ccode);
		newPanel.add(cardCode);
		newPanel.add(edate);
		newPanel.add(expDate);
		newPanel.add(cardType);
		newPanel.add(cardCompanies);

		newPanel.add(contact);
		newPanel.add(phoneBox);
		newPanel.add(emailBox);


		newPanel.add(roomDetail);
		//newPanel.add(roomTypes);
		newPanel.add(roomName);
		newPanel.add(roomNumber);
		newPanel.add(date);
		newPanel.add(startTime);
		newPanel.add(endTime);

		newPanel.add(mealPlanDetail);
		newPanel.add(mealPlans);
		newPanel.add(pizzaToppings);
		newPanel.add(sodaChoices);
		newPanel.add(sodaChoices);

		newPanel.add(save);
		newPanel.add(cancel);




		mealPlans.addActionListener(this);
		save.addActionListener(new SaveButtonListener());
		cancel.addActionListener(new CancelButtonListener());

		newPanel.setVisible(true);
		newReservationFrame.add(newPanel);
	}

	public void actionPerformed(ActionEvent item) {

		if(item.getSource() == mealPlans)
		{
			JComboBox cb = (JComboBox)item.getSource();
			String i = (String)cb.getSelectedItem();

			if(i == "Basic Meal Plan")
			{
				soda2 = new JComboBox(sodaChoicesList);
				soda3 = new JComboBox(sodaChoicesList);
				newPanel.add(soda2);
				newPanel.add(soda3);
				newPanel.repaint();
				newPanel.revalidate();
			}
			else if(i == "Bronze Meal Plan")
			{
				toppings2 = new JComboBox(pizzaToppingsList);
				soda2 = new JComboBox(sodaChoicesList);
				soda3 = new JComboBox(sodaChoicesList);
				soda4 = new JComboBox(sodaChoicesList);
				soda5 = new JComboBox(sodaChoicesList);
				side = new JComboBox(sidesList);
				newPanel.add(toppings2);
				newPanel.add(soda2);
				newPanel.add(soda3);
				newPanel.add(soda4);
				newPanel.add(soda5);
				newPanel.add(side);
				newPanel.repaint();
				newPanel.revalidate();
			}
			else if(i == "Silver Meal Plan")
			{
				toppings2 = new JComboBox(pizzaToppingsList);
				toppings3 = new JComboBox(pizzaToppingsList);
				soda2 = new JComboBox(sodaChoicesList);
				soda3 = new JComboBox(sodaChoicesList);
				soda4 = new JComboBox(sodaChoicesList);
				soda5 = new JComboBox(sodaChoicesList);
				newPanel.add(toppings2);
				newPanel.add(toppings3);
				newPanel.add(soda2);
				newPanel.add(soda3);
				newPanel.add(soda4);
				newPanel.add(soda5);
				newPanel.repaint();
				newPanel.revalidate();
			}
			else if(i == "Gold Meal Plan")
			{

				toppings2 = new JComboBox(pizzaToppingsList);
				toppings3 = new JComboBox(pizzaToppingsList);
				soda2 = new JComboBox(sodaChoicesList);
				soda3 = new JComboBox(sodaChoicesList);
				soda4 = new JComboBox(sodaChoicesList);
				soda5 = new JComboBox(sodaChoicesList);
				wingType = new JComboBox(wingTypesList);
				wingFlavors = new JComboBox(wingFlavorsList);
				wingFlavors2 = new JComboBox(wingFlavorsList);
				newPanel.add(toppings2);
				newPanel.add(toppings3);
				newPanel.add(soda2);
				newPanel.add(soda3);
				newPanel.add(soda4);
				newPanel.add(soda5);
				newPanel.add(wingType);
				newPanel.add(wingFlavors);
				newPanel.add(wingFlavors2);
				newPanel.repaint();
				newPanel.revalidate();
			}
			else if(i == "Platinum Meal Plan")
			{
				toppings2 = new JComboBox(pizzaToppingsList);
				toppings3 = new JComboBox(pizzaToppingsList);
				toppings4 = new JComboBox(pizzaToppingsList);
				soda2 = new JComboBox(sodaChoicesList);
				soda3 = new JComboBox(sodaChoicesList);
				soda4 = new JComboBox(sodaChoicesList);
				soda5 = new JComboBox(sodaChoicesList);
				wingType = new JComboBox(wingTypesList);
				wingFlavors = new JComboBox(wingFlavorsList);
				wingFlavors2 = new JComboBox(wingFlavorsList);
				iceCreamFlavors = new JComboBox(iceCreamFlavorsList);
				iceCreamFlavors2 = new JComboBox(iceCreamFlavorsList);
				newPanel.add(toppings2);
				newPanel.add(toppings3);
				newPanel.add(soda2);
				newPanel.add(soda3);
				newPanel.add(soda4);
				newPanel.add(soda5);
				newPanel.add(wingType);
				newPanel.add(wingFlavors);
				newPanel.add(wingFlavors2);
				newPanel.add(iceCreamFlavors);
				newPanel.add(iceCreamFlavors2);
				newPanel.repaint();
				newPanel.revalidate();
			}
		}
		if(item.getSource() == save)
		{
			SaveButtonListener sbl = new SaveButtonListener();
			sbl.actionPerformed(item);
		}
		else if(item.getSource() == cancel)
		{

		}

	}

	private boolean checkCompleteness() {
		if(firstName.getText().isEmpty() || lastName.getText().isEmpty() || phoneNumber.getText().isEmpty() || address.getText().isEmpty() || dob.getText().isEmpty() || email.getText().isEmpty() || cardName.getText().isEmpty() || cardNumber.getText().isEmpty() || cardCode.getText().isEmpty() || expDate.getText().isEmpty())
			return false;
		else
			return true;
	}

	class SaveButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent item) {

        	/*if (!checkCompleteness()) {
        		newPanel.add(error);
        		newPanel.revalidate();
        		newPanel.repaint();
        		return;
			}*/

        	/*SetDateAndTimeFrame setDateAndTimeFrame = new SetDateAndTimeFrame();
			setDateAndTimeFrame.createGUI(roomTypes.getSelectedItem().toString());
			setDateAndTimeFrame.setVisible(true);*/

			Card card = new Card(cardInfo.getText(), cardCompanies.getSelectedItem().toString(), cardCode.getText(),
					expDate.getText());

			GuestInfo gi = new GuestInfo(firstName.getText(), lastName.getText(), phoneNumber.getText(), address.getText(),
					dob.getText(), email.getText());


			RoomFactory roomFactory = null;
			//switch (roomTypes.getSelectedItem().toString()) {
			
			switch (roomName.getText()) {
				case "Small Party Room":
					roomFactory = new SmallPartyRoomFactory();
					break;
				case "Medium Party Room":
					roomFactory = new MediumPartyRoomFactory();
					break;
				case "Aquaworld Room":
					roomFactory = new AquaworldRoomFactory();
					break;
				case "Billiards Lounge":
					roomFactory = new BilliardsLoungeFactory();
					break;
				case "Karaoke Lounge":
					roomFactory = new KaraokeLoungeFactory();
					break;
			}
			Room room = roomFactory.createRoom();

			String mp = mealPlans.getSelectedItem().toString();
			switch(mp)
			{
				case "Basic Meal Plan":
					BasicMealPlan bmp = new BasicMealPlan();
					break;
				case "Bronze Meal Plan":
					BronzeMealPlan brmp = new BronzeMealPlan();
					brmp.setSide(side.getSelectedItem().toString());
					break;
				case "Silver Meal Plan":
					SilverMealPlan smp = new SilverMealPlan();
					break;
				case "Gold Meal Plan":
					GoldMealPlan gmp = new GoldMealPlan();
					gmp.setWingType(wingType.getSelectedItem().toString());
					gmp.setWingFlavor1(wingFlavors.getSelectedItem().toString());
					gmp.setWingFlavor2(wingFlavors2.getSelectedItem().toString());
					break;
				case "Platinum Meal Plan":
					PlatinumMealPlan pmp = new PlatinumMealPlan();
					pmp.setWingType(wingType.getSelectedItem().toString());
					pmp.setWingFlavor1(wingFlavors.getSelectedItem().toString());
					pmp.setWingFlavor2(wingFlavors2.getSelectedItem().toString());
					pmp.setICFlavor1(iceCreamFlavors.getSelectedItem().toString());
					pmp.setICFlavor2(iceCreamFlavors2.getSelectedItem().toString());
					break;
			}


			if(roomName.getText().equals("Billiards Lounge")) {
				int month = Integer.parseInt(dob.getText().substring(0, 2));
				int day = Integer.parseInt(dob.getText().substring(3, 5));
				int year = Integer.parseInt(dob.getText().substring(6, 10));

				LocalDate start = LocalDate.of(year, month, day);
				LocalDate end = LocalDate.now();
				long years = ChronoUnit.YEARS.between(start, end);
				if (years < 21) {
					newPanel.add(ageError);
					newPanel.revalidate();
					newPanel.repaint();
					return;
				}
			}



			//Reservation reservation = new Reservation(setDateAndTimeFrame.getDate(), setDateAndTimeFrame.getStartTime(), setDateAndTimeFrame.getEndTime(), room, gi, card);
			Reservation reservation = new Reservation(rDate, rStartTime, rEndTime, room, gi, card);
			//NewReservationFrame.this.manageReservation.addReservation(reservation);
			int confirmNum = manageReservation.addReservation(reservation);

			newReservationFrame.dispose();
			
			String a = reservation.toString();
			
			ConfirmationFrame confirm = new ConfirmationFrame();
			confirm.addText(a);
			String b = String.format("Your confirmation number is %s", confirmNum);
			confirm.addText(b);
			


		}
	}

	class CancelButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent item) {

			newReservationFrame.dispose();

		}
	}

	//
	public static void main(String[] args) {

		NewReservationFrame nrf =  new NewReservationFrame();
	}

}
