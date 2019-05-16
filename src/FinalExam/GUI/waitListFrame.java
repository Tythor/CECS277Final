package FinalExam.GUI;


import java.awt.Component;

import FinalExam.GUI.SetDateAndTimeFrame;
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
	private String name;
	
	private JPanel waitListPanel;
	
	private static final int FRAME_WIDTH = 425;
	private static final int FRAME_HEIGHT = 300;
	
	
	public waitListFrame(String n) {
		name = n;
		createComponents();
		this.setTitle("WaitList");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
	}
	
	
	private void createComponents() {
		
		message = new JLabel();
		message.setText("No availability on selected date/time. Add to waitlist?");
			
		ActionListener captureListener = new responseButtonListenerS();
		ActionListener captureListener2 = new responseButtonListenerD();
		
		accept = new JButton("Accept");
		accept.addActionListener(captureListener);
	
		
		decline = new JButton("Decline");
		decline.addActionListener(captureListener2);
		
		waitListPanel = new JPanel();
		
		//waitListPanel.add(message);
		waitListPanel.add(message);
		waitListPanel.add(accept);
		
		waitListPanel.add(decline);
		
		this.add(waitListPanel); // adds waitListPanel panel to the frame
	}
	
	class responseButtonListenerS implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent r) {
			
			JButton responseButton = (JButton) r.getSource();
			
			waitListFrame  w = (waitListFrame) SwingUtilities.getRoot(responseButton); // Type Cast
				
				w.setVisible(false);
				
				ConfirmWaitList wait = new ConfirmWaitList();
				//NewReservationFrame newRes = new NewReservationFrame(); // If the user accepts to be added to the waitlist, and the NewReservationFrame appears again
								
				//System.out.println("Not generating an ID at the moment for check in") // Testing Purposes
				
				// Finish This

		}	
	}
	
class responseButtonListenerD implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent click) {
			
		    Component n = (Component) click.getSource(); //e.getSource() returns Object
            JFrame m = (JFrame) SwingUtilities.getRoot(n);
            m.setVisible(false);
			SetDateAndTimeFrame timeSlot = new SetDateAndTimeFrame();
			timeSlot.createGUI(name);
			timeSlot.setVisible(true);

		}	
	}
	

	
	public static void main(String[] args) {
		
		
		waitListFrame beginWaitList = new waitListFrame("Small Party Room");

		beginWaitList.setVisible(true);
				
	}
		
}
