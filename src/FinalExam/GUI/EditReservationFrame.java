package FinalExam.GUI;

import FinalExam.Reservation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static FinalExam.GUI.MainFrame.manageReservation;

public class EditReservationFrame implements ActionListener {
	
	private JTextField enterNum, enterName;
	private JLabel reservationType, confirmationNum, guestName;
	private JButton confirmed, waitlist, delete;
	
	private JPanel newPanel;
	private JFrame editReservationFrame = new JFrame();
	
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	
	public EditReservationFrame()
	{
		createComponents();
		editReservationFrame.setVisible(true);
		editReservationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editReservationFrame.setTitle("Edit Reservation");
		editReservationFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		editReservationFrame.setLocationRelativeTo(null);
		editReservationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void createComponents() {
		newPanel = new JPanel();
		
		reservationType = new JLabel("Select Reservation Type:");
		enterNum = new JTextField(5);
		confirmed = new JButton("Confirmed Reservation");
		enterName = new JTextField(5);
		waitlist = new JButton("Waitlist Reservation");
		delete = new JButton("Delete Reservation");

		newPanel.add(reservationType);
		newPanel.add(enterNum);
		newPanel.add(confirmed);
		newPanel.add(enterName);
		newPanel.add(waitlist);
		newPanel.add(delete);

		updateReservationList();
		
		confirmed.addActionListener(this);
		waitlist.addActionListener(this);
		
		newPanel.setVisible(true);
		editReservationFrame.add(newPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent item) {
		
		if(item.getSource() == confirmed)
		{
			checkConfirmed();
		}
		else if(item.getSource() == waitlist)
		{
			checkWaitlist();
		}
		else if(item.getSource() == delete)
		{
			deleteReservation();
		}
		
	}
	
	public void checkConfirmed()
	{
		manageReservation.getReservations().set(Integer.parseInt(enterNum.getText()) - 1, new NewReservationFrame().reservation);
		updateReservationList();
		/*if()
		{
			
		}
		else
		{
			editFrame();
		}*/
	}
	
	public void checkWaitlist()
	{
		/*if()
		{

		}
		else
		{
			editFrame();
		}*/
	}

	public void deleteReservation()
	{
		Reservation reservation = manageReservation.getReservations().remove(Integer.parseInt(enterNum.toString()) + 1);
		newPanel.add(new JLabel("Removed " + reservation.toString()));
		updateReservationList();
	}
	
	public void editFrame()
	{
		NewReservationFrame nrf = new NewReservationFrame();
		//Reservation reservation = manageReservation.getR
		
		//nrf.setFirstName(reservation.getF);
		
	}

	public void updateReservationList() {
		for (Reservation reservation : manageReservation.getReservations()) {
			newPanel.add(new JLabel(reservation.toString()));
		}
		newPanel.repaint();
		newPanel.validate();
	}
	
	public static void main(String[] args) {
		
		EditReservationFrame erf = new EditReservationFrame();
		
	}
	
}
