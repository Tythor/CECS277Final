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

import FinalExam.GUI.NewReservationFrame.CancelButtonListener;

public class ConfirmationFrame {

	JFrame frame;
	JLabel label;
	JPanel panel;
	JButton close;
	JTextArea confirm;
	
	
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	
	
	public ConfirmationFrame() {
		frame = new JFrame();
		createComponents();
		frame.setTitle("Confirmation");
		frame.setVisible(true);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	
	public void createComponents() {
		final int ROW = 35;
		final int COLUMN = 60;
		confirm = new JTextArea(ROW, COLUMN);
		confirm.setEditable(false);
		close = new JButton("Close");
		
		close.addActionListener(new CloseButtonListener());
		
		panel = new JPanel();
		panel.add(confirm);
		JScrollPane scrollPane = new JScrollPane(confirm);
		panel.add(scrollPane);
		panel.add(close);
		
		frame.add(panel);
		
	}
	
	public void addText(String a) {
		confirm.append(a);
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
