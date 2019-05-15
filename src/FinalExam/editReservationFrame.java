package FinalExam;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class editReservationFrame extends JFrame {
	
	private JLabel confirmationNumber;
	private JLabel guestName; 
	
	private JTextField confirmationNumberResponse;
	private JTextField guestNameResponse;
	
	private JButton saveButton;
	private JButton deleteButton;
	
	private JPanel editReservationPanel;
	
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	
	public editReservationFrame() {
		createComponents();
		this.setTitle("Edit Reservation");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
				
	}
	
	private void createComponents() {
		
		editReservationPanel = new JPanel();
		
		confirmationNumber = new JLabel();
		confirmationNumber.setText("Confirmation Number");
		
		guestName = new JLabel();
		guestName.setText("Guest Name");
		
		confirmationNumberResponse = new JTextField(25);
		guestNameResponse = new JTextField(25);
		
		
		saveButton = new JButton();
		saveButton.setText("Save");
		
		deleteButton = new JButton();
		deleteButton.setText("Delete Reservation");
		
		editReservationPanel.add(confirmationNumber);
		editReservationPanel.add(confirmationNumberResponse);
		editReservationPanel.add(guestName);
		editReservationPanel.add(guestNameResponse);
		editReservationPanel.add(saveButton);
		editReservationPanel.add(deleteButton);
		
		
		this.add(editReservationPanel);
	}
	
	public static void main(String[] args) {
		
		editReservationFrame e = new editReservationFrame();
		
		e.setVisible(true);
		
		e.deleteButton.setVisible(false); // set the delete button to false for now
	}

}
