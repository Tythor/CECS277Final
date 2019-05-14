package FinalExam.GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class waitListFrame extends JFrame {
	
	//private JLabel message;
	private JLabel message;
	private JButton accept;
	private JButton decline;
	
	private JPanel waitListPanel;
	
	private static final int FRAME_WIDTH = 425;
	private static final int FRAME_HEIGHT = 300;
	
	
	public waitListFrame() {
		createComponents();
		this.setTitle("WaitList");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
	}
	
	
	private void createComponents() {
		
		message = new JLabel();
		message.setText("No availability on selected date/time. Add to waitlist?");
			
		ActionListener captureListener = new responseButtonListener();
		
		accept = new JButton("Accept");
		accept.addActionListener(captureListener);
		
		
		decline = new JButton("Decline");
		decline.addActionListener(captureListener);
		
		waitListPanel = new JPanel();
		
		//waitListPanel.add(message);
		waitListPanel.add(message);
		waitListPanel.add(accept);
		
		waitListPanel.add(decline);
		
		this.add(waitListPanel); // adds waitListPanel panel to the frame
	}
	
	class responseButtonListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent r) {
			
			JButton responseButton = (JButton) r.getSource();
			
			waitListFrame  w = (waitListFrame) SwingUtilities.getRoot(responseButton); // Type Cast
			
			if (responseButton.getText().equals("Accept")) {
				
				w.setVisible(false);
				
				NewReservationFrame newRes = new NewReservationFrame(); // If the user accepts to be added to the waitlist, and the NewReservationFrame appears again
								
				//System.out.println("Not generating an ID at the moment for check in") // Testing Purposes
				
				// Finish This
			}
			
			else if (responseButton.getText().equals("Decline")) { // Otherwise, ...
				
				//System.out.println("Choosing a different date and/or time slot for reservations"); // Testing Purposes
								
				w.setVisible(false);
				
				SetDateAndTimeFrame timeSlot = new SetDateAndTimeFrame(); // If the guests does not want to waitlist, then let them choose a different time
				
				timeSlot.setVisible(true);
				
				// Finish This
			}
		}	
	}
	
	public static void main(String[] args) {
		
		
		waitListFrame beginWaitList = new waitListFrame();

		beginWaitList.setVisible(true);
				
	}
		
}
