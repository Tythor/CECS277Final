package FinalExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CheckInFrame extends JFrame{
	
	//private JLabel message;
		private static JList guests;
		private JButton checkIn;
		private JButton cancel;
		
		private JPanel CheckInPanel;
		
		private static final int FRAME_WIDTH = 425;
		private static final int FRAME_HEIGHT = 300;
		
		
		public CheckInFrame() {
			createComponents();
			this.setTitle("Check In Frame");
			this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
			
		}
		
		
		private void createComponents() {
			
			guests = new JList();
				
			ActionListener captureListener = new responseButtonListener();
			
			checkIn = new JButton("Check In");
			checkIn.addActionListener(captureListener);
			
			
			cancel = new JButton("Cancel");
			cancel.addActionListener(captureListener);
			
			CheckInPanel = new JPanel();
			
			CheckInPanel.add(guests);
			CheckInPanel.add(checkIn);
			CheckInPanel.add(cancel);
			
			this.add(CheckInPanel); // adds waitListPanel panel to the frame
		}
		
		class responseButtonListener implements ActionListener {

			
			@Override
			public void actionPerformed(ActionEvent r) {
				
				JButton responseButton = (JButton) r.getSource();
				
				CheckInFrame  c = (CheckInFrame) SwingUtilities.getRoot(responseButton); // Type Cast
				
				if (responseButton.getText().equals("Check In")) {
					
					c.setVisible(false);
					
					System.out.println("Checking in a guest");
									
					// Finish This
				}
				
				else if (responseButton.getText().equals("Cancel")) { // Otherwise, ...
					
					//System.out.println("Choosing a different date and/or time slot for reservations"); // Testing Purposes
									
					c.setVisible(false);
					
					//c.setDefaultCloseOperation(c.EXIT_ON_CLOSE);
	
					// Finish This
				}
			}	
		}

		public static void main (String[] args) {
			CheckInFrame v = new CheckInFrame();
			
			v.setVisible(true);

			v.add(guests);
		}
		
}
