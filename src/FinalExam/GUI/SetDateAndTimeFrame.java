package FinalExam.GUI;


/*
 * This application demonstrates using spinners.
 * Other files required:
 *   SpringUtilities.java
 *   CyclingSpinnerListModel.java
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import FinalExam.ManageReservation;
import FinalExam.Room;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDateAndTimeFrame extends JPanel implements ChangeListener {
    protected Calendar calendar;
    protected JSpinner dateSpinner;
    private JButton save;
    private JButton cancel;
    private JPanel panel;
    private JComponent e;
    private JSpinner spinner;
    private JFrame frame;
    private String name;

    private static SpinnerModel monthModel;
    private static SpinnerModel dayModel;
    private static SpinnerModel yearModel;
    private static SpinnerModel timeModel;
    private static SpinnerModel timeMod;

    private FinalExam.Date date;
    private Time startTime;
    private Time endTime;


    public SetDateAndTimeFrame() {
    }
    
    
    public void createGUI(String n) {
    	frame = new JFrame();
        createComponents();
        frame.setTitle(n);
        frame.pack();
        frame.setVisible(true);
        name = n;
    }

    public SetDateAndTimeFrame(boolean cycleMonths) {
        super(new SpringLayout());

        String[] labels = {"Month: ", "Day: ", "Year: ", "Time Start: ", "Time End: "};
        int numPairs = labels.length;
        calendar = Calendar.getInstance();
        JFormattedTextField ftf;

        //Add month component
        String[] monthStrings = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthModel = new SpinnerListModel(monthStrings);
        spinner = addLabeledSpinner(this, labels[0], monthModel);

        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinner);
        if (ftf != null) {
            ftf.setColumns(8); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);

        }

        //add day component
        int currentDay = 1;
        dayModel = new SpinnerNumberModel(currentDay, 1, 31, 1);
        spinner = addLabeledSpinner(this, labels[1], dayModel);
        //Make the year be formatted without a thousands separator.
        spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));


        //Add year component
        int currentYear = calendar.get(Calendar.YEAR);
        yearModel = new SpinnerNumberModel(currentYear, currentYear, currentYear + 6, 1);
        spinner = addLabeledSpinner(this, labels[2], yearModel);
        //Make the year be formatted without a thousands separator.
        spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));


        //Add start time component
        Date initTime = calendar.getTime();
        timeModel = new SpinnerDateModel(initTime, null, null, Calendar.HOUR_OF_DAY);
        dateSpinner = spinner = addLabeledSpinner(this, labels[3], timeModel);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "HH:mm a"));
        ftf = getTextField(spinner);

        if (ftf != null) {
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            ftf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 3));
        }

        //add end time component
        Date endTime = calendar.getTime();
        timeMod = new SpinnerDateModel(endTime, null, null, Calendar.HOUR_OF_DAY);
        dateSpinner = spinner = addLabeledSpinner(this, labels[4], timeMod);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "HH:mm a"));

        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinner);
        if (ftf != null) {
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            ftf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 3));
        }

        dateSpinner.addChangeListener(this);
        //Lay out the panel.
        SpringUtilities.makeCompactGrid(this, numPairs, 2, 10, 10, 6, 10);
    }


    /**
     * Return the formatted text field used by the editor, or
     * null if the editor doesn't descend from JSpinner.DefaultEditor.
     */
    public JFormattedTextField getTextField(JSpinner spinner) {
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            return ((JSpinner.DefaultEditor) editor).getTextField();
        } else {
            System.err.println("Unexpected editor type: "
                    + spinner.getEditor().getClass()
                    + " isn't a descendant of DefaultEditor");
            return ((JSpinner.DefaultEditor) editor).getTextField();
        }
    }

    /**
     * Required by the ChangeListener interface. Listens for
     * changes in the date spinner and does something silly in
     * response.
     */
    public void stateChanged(ChangeEvent e) {
        SpinnerModel monthModel = dateSpinner.getModel();
        SpinnerModel dayModel = dateSpinner.getModel();
        SpinnerModel yearModel = dateSpinner.getModel();
        SpinnerModel timeModel = dateSpinner.getModel();
        SpinnerModel timeMod = dateSpinner.getModel();
        if (monthModel instanceof SpinnerListModel && dayModel instanceof SpinnerNumberModel
                && yearModel instanceof SpinnerNumberModel && timeModel instanceof SpinnerDateModel
                && timeMod instanceof SpinnerDateModel) {
            e = (ChangeEvent) spinner.getValue();
        }
    }


    protected JSpinner addLabeledSpinner(Container c,
                                         String label,
                                         SpinnerModel model) {
        JLabel l = new JLabel(label);
        c.add(l);

        spinner = new JSpinner(model);
        l.setLabelFor(spinner);
        c.add(spinner);

        return spinner;
    }

    
    public JComponent findDate() {
        e = spinner.getEditor();
        return e;
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */


    public void createComponents() {
        panel = new JPanel();
        save = new JButton("Check Availability");
        cancel = new JButton("Cancel");
        panel.add(new SetDateAndTimeFrame(true));
        panel.add(save);
        panel.add(cancel);


        save.addActionListener(new saveButtonListener());
        cancel.addActionListener(new cancelButtonListener());


        frame.add(panel);
    }

    public FinalExam.Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    class saveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            Component n = (Component) click.getSource(); //e.getSource() returns Object
            JFrame m = (JFrame) SwingUtilities.getRoot(n);
            m.setVisible(false);
            //System.out.println(e);
            String month = (String) monthModel.getValue();
            int day = (int) dayModel.getValue();
            int year = (int) yearModel.getValue();
            String startTime = new SimpleDateFormat("HH:mm").format(timeModel.getValue());
            String endTime = new SimpleDateFormat("HH:mm").format(timeMod.getValue());
            Room r = new Room();
            //boolean available = r.isAvaliable(month, day, year, startTime, endTime, name);


            int monthInt = 0;

            if(month.equals("January")) {
                monthInt = 1;
            }
            if(month.equals("February")) {
                monthInt = 2;
            }
            if(month.equals("March")) {
                monthInt = 3;
            }
            if(month.equals("April")) {
                monthInt = 4;
            }
            if(month.equals("May")) {
                monthInt = 5;
            }
            if(month.equals("June")) {
                monthInt = 6;
            }
            if(month.equals("July")) {
                monthInt = 7;
            }
            if(month.equals("August")) {
                monthInt = 8;
            }
            if(month.equals("September")) {
                monthInt = 9;
            }
            if(month.equals("October")) {
                monthInt = 10;
            }
            if(month.equals("November")) {
                monthInt = 11;
            }
            if(month.equals("December")) {
                monthInt = 12;
            }
            FinalExam.Date newDate = new FinalExam.Date();
            newDate.setMonth(monthInt);
            newDate.setDay(day);
            newDate.setYear(year);

            String hourS = startTime.substring(0, 2);
            String hourE = endTime.substring(0, 2);
            String minuteS = startTime.substring(3, 5);
            String minuteE = endTime.substring(3, 5);
            int startH = Integer.parseInt(hourS);
            int startM = Integer.parseInt(minuteS);
            int endH = Integer.parseInt(hourE);
            int endM = Integer.parseInt(minuteE);
            Time timeS = new Time(startH, startM, 0);
            Time timeE = new Time(endH, endM, 0);
            System.out.println(timeS);
            System.out.println(newDate);

            ManageReservation manageReservation = new ManageReservation();
            boolean isAvailable = manageReservation.checkAvailable(newDate, timeS, timeE, name);

            if (isAvailable) {
            	NewReservationFrame nrf = new NewReservationFrame(newDate, timeS, timeE, name);
            	System.out.println("yay");
            }
            else {
            	waitListFrame wait = new waitListFrame(name);
            	wait.setVisible(true);
            }
            System.out.println(startTime);
            System.out.println(endTime);

            SetDateAndTimeFrame.this.date = newDate;
            SetDateAndTimeFrame.this.startTime = timeS;
            SetDateAndTimeFrame.this.endTime = timeE;


        }
    }

    class cancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            Component n = (Component) click.getSource(); //e.getSource() returns Object
            JFrame m = (JFrame) SwingUtilities.getRoot(n);
            m.setVisible(false);

        }
    }
}