package FinalExam.GUI;

import FinalExam.GuestInfo;
import FinalExam.Reservation;
import FinalExam.Reservation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckInFrame extends JPanel {
    private static final int FRAME_WIDTH = 425;
    private static final int FRAME_HEIGHT = 300;

    JList<Reservation> list;
    JButton check_in;
    JButton cancel;
    JPanel panel;
    JFrame frame;


    public CheckInFrame() {
        frame = new JFrame();
        frame.setTitle("Check In Frame");
        createComponents();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }

    public void createComponents(){
        //get reservations
        list = new JList<Reservation>();
        check_in = new JButton("Check-in");

        cancel = new JButton("Cancel");


        panel = new JPanel();
        panel.add(list);
        Reservation reserv = list.getSelectedValue();
        ActionListener checkinListener = new CheckInlistener();
        check_in.addActionListener(checkinListener);
        panel.add(check_in);
        panel.add(cancel);
        frame.add(panel);
    }

    class CheckInlistener implements ActionListener {
        public void actionPerformed(ActionEvent x) {
            JButton temp = (JButton) x.getSource();

        }
    }
    public static void main(String[] args) {


        CheckInFrame beginWaitList = new CheckInFrame();

        beginWaitList.setVisible(true);

    }

}