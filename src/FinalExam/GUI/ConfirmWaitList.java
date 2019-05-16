package FinalExam.GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import FinalExam.GUI.ConfirmationFrame.CloseButtonListener;

public class ConfirmWaitList {

		JFrame frame;
		JLabel label;
		JPanel panel;
		JButton close;
		//JTextArea confirm;
		
		
		private static final int FRAME_WIDTH = 450;
		private static final int FRAME_HEIGHT = 300;
		
		
		public ConfirmWaitList() {
			frame = new JFrame();
			createComponents();
			frame.setTitle("WaitList");
			frame.setVisible(true);
			frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		}
		
		
		public void createComponents() {
			label = new JLabel("You've been added to the waitlist. Waitlist Number: 1");
			close = new JButton("Close");
			
			close.addActionListener(new CloseButtonListener());
			
			panel = new JPanel();
			panel.add(label);
			panel.add(close);
			
			frame.add(panel);
			
		}
		
	
		
		class CloseButtonListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent click) {
				 Component n = (Component) click.getSource(); //e.getSource() returns Object
		            JFrame m = (JFrame) SwingUtilities.getRoot(n);
		            m.setVisible(false);


			}
		}
	}

