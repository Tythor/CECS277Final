package FinalExam;


/*
 * This application demonstrates using spinners.
 * Other files required:
 *   SpringUtilities.java
 *   CyclingSpinnerListModel.java
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class SetDateAndTimeFrame extends JPanel implements ChangeListener {
    protected Calendar calendar;
    protected JSpinner dateSpinner;
    private JButton save;
    private JButton cancel;
    private String month;
    private JPanel panel;
    private Date s;
    private JComponent e;
    private JSpinner spinner;
    private JFrame frame;
    private JFormattedTextField text;

    private static SpinnerModel monthModel;
    private static SpinnerModel dayModel;
    private static SpinnerModel yearModel;
    private static SpinnerModel timeModel;
    private static SpinnerModel timeMod;


    public SetDateAndTimeFrame() {
        frame = new JFrame();
        createComponents();
        frame.setTitle("Something");
        frame.pack();
        frame.setVisible(true);
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
//        SpringUtilities.makeCompactGrid(this, numPairs, 2, 10, 10, 6, 10);
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

    class saveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            Component n = (Component) click.getSource(); //e.getSource() returns Object
            JFrame m = (JFrame) SwingUtilities.getRoot(n);
            m.setVisible(false);
            //System.out.println(e);
            System.out.println(monthModel.getValue());
            System.out.println(dayModel.getValue());
            System.out.println(yearModel.getValue());
            System.out.println(timeModel.getValue());
            System.out.println(timeMod.getValue());
            System.out.println(monthModel.getValue() + " " + dayModel.getValue() + ", " + yearModel.getValue());
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