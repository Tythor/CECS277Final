package FinalExam.GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CheckOutFrame extends JFrame {
	
	private JPanel checkOutPanel;

	private JLabel totalDamageCost;
	private JLabel destruction; 
	
	private JTextField damageCost;
	private JTextField damageDescription;
		
	private JButton checkOutButton;
	
	private static final int FRAME_WIDTH = 440;
	private static final int FRAME_HEIGHT = 480;
	
	private static JTextArea text = new JTextArea(25, 50); // Sets and Initializes the JTextArea and size as well at once!
	
	private static ArrayList<String> damagedItems = new ArrayList<String> ();
	
	public CheckOutFrame() {
		createComponents();
		this.setTitle("Check Out");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		text.setText(" ********** Invoice **********\n");
		
		this.setVisible(true);
		
	}
	
	public void createComponents() {
		
		ActionListener chkOut = new checkOutListener();
		
		checkOutPanel = new JPanel();
		
		totalDamageCost = new JLabel("Charge: $");
		damageCost = new JTextField(30);
		
		destruction = new JLabel("Damage: ");
		damageDescription = new JTextField(25);
		
		checkOutButton = new JButton("Check Out");
		
		checkOutPanel.add(totalDamageCost);
		checkOutPanel.add(damageCost);
		
		checkOutPanel.add(destruction);
		checkOutPanel.add(damageDescription);
		
		checkOutPanel.add(checkOutButton);
		
		checkOutButton.addActionListener(chkOut); // Adds response to the check out button
		
		
		this.add(checkOutPanel); // Adds the panel to the frame
		
	}
	
	class checkOutListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent c) {
			
			JButton chkTemp = (JButton) c.getSource();
			
			CheckOutFrame finalizeFrame = (CheckOutFrame) SwingUtilities.getRoot(chkTemp);
			
			if(chkTemp.getText().equals("Check Out")) {
				
				System.out.println("Checking out a guest"); // CheckPoint 1
			
				System.out.println(damageCost.getText()); // Testing Purposes
				System.out.println(damageDescription.getText());
				Component n = (Component) c.getSource(); //e.getSource() returns Object
				JFrame m = (JFrame) SwingUtilities.getRoot(n);
				m.setVisible(false);
				
				// Checkpoint 2
				
			}
			
		}
		
	}
	
	public static void main(String [] args) {
		
		CheckOutFrame ch = new CheckOutFrame();
		
		ch.setVisible(true);
	}
	
	

}
