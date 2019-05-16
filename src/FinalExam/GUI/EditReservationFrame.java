package FinalExam.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
		
		reservationType = new JLabel("Select Reservation Type");
		confirmed = new JButton("Confirmed Reservation");
		waitlist = new JButton("Waitlist Reservation");
		
		newPanel.add(reservationType);
		newPanel.add(confirmed);
		newPanel.add(waitlist);
		
		confirmed.addActionListener(this);
		waitlist.addActionListener(this);
		
		newPanel.setVisible(true);
		editReservationFrame.add(newPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent item) {
		enterNum = new JTextField();
		newPanel.add(enterNum);
		enterNum.setVisible(true);
		
		if(item.getSource() == confirmed)
		{
			checkConfirmed();
		}
		else if(item.getSource() == waitlist)
		{
			checkWaitlist();
		}
		
	}
	
	public void checkConfirmed()
	{
		if()
		{
			
		}
		else
		{
			editFrame();
		}
	}
	
	public void checkWaitlist()
	{
		if()
		{
			
		}
		else
		{
			editFrame();
		}
	}
	
	public void editFrame()
	{
		NewReservationFrame nrf = new NewReservationFrame();
		
	}
	
	public static void main(String[] args) {
		
		EditReservationFrame erf = new EditReservationFrame();
		
	}
	
}
