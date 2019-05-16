package FinalExam.GUI;

import FinalExam.GuestInfo;
import FinalExam.MakeReservation;

import javax.swing.*;

public class CheckInFrame extends JPanel {
    private static final int FRAME_WIDTH = 425;
    private static final int FRAME_HEIGHT = 300;

    JList<MakeReservation> list;
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
        list = new JList<MakeReservation>();
        check_in = new JButton("Check-in");
        cancel = new JButton("Cancel");


        panel = new JPanel();
        panel.add(list);
        MakeReservation reserv = list.getSelectedValue();
        panel.add(check_in);
        panel.add(cancel);
        frame.add(panel);
    }
    public static void main(String[] args) {


        CheckInFrame beginWaitList = new CheckInFrame();

        beginWaitList.setVisible(true);

    }

}
