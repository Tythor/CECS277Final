package FinalExam.GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;

public class SetDateAndTimeFrame extends JFrame{

	private JSpinner month;
	private JPanel panel;
	private JComboBox<String> dates;
	
	public SetDateAndTimeFrame() {
		createComponents();
		this.setTitle("Set Date and Time");
		this.setSize(900,400);
		
	}
	
	public void createComponents() {
//		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//		dates = new JComboBox<String>(monthNames);
//		panel.add(dates);
//		this.add(panel);
	}
}
