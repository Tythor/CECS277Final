package FinalExam.GUI;

import FinalExam.GuestInfo;
import FinalExam.ManageReservation;
import FinalExam.Reservation;
import FinalExam.Reservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CheckInFrame extends JPanel {
    private static final int FRAME_WIDTH = 425;
    private static final int FRAME_HEIGHT = 300;

    JList<String> list;
    JButton check_in;
    JButton cancel;
    JPanel panel;
    JFrame frame;
    Reservation reserv;


    public CheckInFrame() {
        frame = new JFrame();
        frame.setTitle("Check In Frame");
        createComponents();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }

    public void createComponents(){
        //get reservations
        ArrayList<Reservation> r = ManageReservation.getReservations();
        ArrayList<String> r_string = new ArrayList<>();
        for (Reservation res: r) {
            r_string.add(res.toString());
        }
        // iteration and putting arraylist into jlist
//        for (String res: r_string) {
//            list.add(res);
//        }

        check_in = new JButton("Check-in");

        cancel = new JButton("Cancel");



        panel = new JPanel();
        panel.add(list);
        int res_index = list.getSelectedIndex();
        ActionListener checkInListener = new CheckInlistener();
        check_in.addActionListener(checkInListener);
        ActionListener CancelListener = new CancelListener();
        cancel.addActionListener(CancelListener);
        panel.add(check_in);
        panel.add(cancel);
        frame.add(panel);
    }

    class CheckInlistener implements ActionListener {
        public void actionPerformed(ActionEvent select) {
            reserv.finalizeReservation(true);
//            JButton temp = (JButton) select.getSource();

        }
    }

    class CancelListener implements ActionListener {
        public void actionPerformed(ActionEvent click) {
            Component n = (Component) click.getSource(); //e.getSource() returns Object
            JFrame m = (JFrame) SwingUtilities.getRoot(n);
            m.setVisible(false);
        }
    }


    public static void main(String[] args) {


        CheckInFrame beginWaitList = new CheckInFrame();

        beginWaitList.setVisible(true);

    }

}
