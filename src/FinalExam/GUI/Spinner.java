package FinalExam.GUI;


/*
* This application demonstrates using spinners.
* Other files required:
*   SpringUtilities.java
*   CyclingSpinnerListModel.java
*/

import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.util.Calendar;
import java.util.Date;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinner extends JPanel implements ChangeListener {
    protected Calendar calendar;
    protected JSpinner dateSpinner;
    private JButton save;
    private JButton cancel;
    private String month;
    private String day;
    private String year;
    private String hourS;
    private String minuteS;
    private String hourE;
    private Date s;
    private Date e;
    private JSpinner spinner;

//    protected Color SPRING_COLOR = new Color(0, 204, 51);
//    protected Color SUMMER_COLOR = Color.RED;
//    protected Color FALL_COLOR = new Color(255, 153, 0);
//    protected Color WINTER_COLOR = Color.CYAN;

    public Spinner(boolean cycleMonths) {
        super(new SpringLayout());

        String[] labels = {"Month: ", "Day: ", "Year: ", "Time Start: ", "Time End: "};
        int numPairs = labels.length;
        calendar = Calendar.getInstance();
        JFormattedTextField ftf = null;

        //Add the first label-spinner pair.
        String[] monthStrings = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        SpinnerListModel monthModel = null;
        if (cycleMonths) { //use custom model
            monthModel = new CyclingSpinnerListModel(monthStrings);
        } else { //use standard model
            monthModel = new SpinnerListModel(monthStrings);
        }
        spinner = addLabeledSpinner(this,
                                             labels[0],
                                             monthModel);
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinner);
        if (ftf != null ) {
            ftf.setColumns(8); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            month = ftf.getText();
        }

     //add 2nd label
        int currentDay = 1;
        SpinnerModel dayModel = new SpinnerNumberModel(currentDay, //initial value
                                       1, //min
                                       31, //max
                                       1);                //step
        //If we're cycling, hook this model up to the month model.
        if (monthModel instanceof CyclingSpinnerListModel) {
            ((CyclingSpinnerListModel)monthModel).setLinkedModel(dayModel);
        }
        spinner = addLabeledSpinner(this, labels[1], dayModel);
        //Make the year be formatted without a thousands separator.
        spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));
        day = getTextField(spinner).getText();

        //Add 3rd label-spinner pair.
        int currentYear = calendar.get(Calendar.YEAR);
        SpinnerModel yearModel = new SpinnerNumberModel(currentYear, //initial value
                                       currentYear, //min
                                       currentYear + 6, //max
                                       1);                //step
        //If we're cycling, hook this model up to the month model.
        if (monthModel instanceof CyclingSpinnerListModel) {
            ((CyclingSpinnerListModel)monthModel).setLinkedModel(yearModel);
        }
        spinner = addLabeledSpinner(this, labels[2], yearModel);
        //Make the year be formatted without a thousands separator.
        spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));
        year = getTextField(spinner).getText();
        
        
   
 
		//Add the 4th label-spinner pair
        Date initTime = calendar.getTime();
        SpinnerDateModel timeModel = new SpinnerDateModel(initTime,
                                     null,
                                     null,
                                     Calendar.HOUR_OF_DAY);//ignored for user input
        dateSpinner = spinner = addLabeledSpinner(this, labels[3], timeModel);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "HH:mm a"));
        ftf = getTextField(spinner);
        if(ftf != null) {
        	ftf.setHorizontalAlignment(JTextField.RIGHT);
        	ftf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 3));
        	hourS = ftf.getText();
        }
        
        
        
        //add 5th 
        Date endTime = calendar.getTime();
        SpinnerDateModel timeMod = new SpinnerDateModel(endTime,
                                     null,
                                     null,
                                     Calendar.HOUR_OF_DAY);//ignored for user input
        dateSpinner = spinner = addLabeledSpinner(this, labels[4], timeMod);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "HH:mm a"));
       
        
        
        
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinner);
        if (ftf != null ) {
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            ftf.setBorder(BorderFactory.createEmptyBorder(1,1,1,3));
            hourE = ftf.getText();
        }
        //spinner.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        //XXX: No easy way to get to the buttons and change their border.
        //setSeasonalColor(dateModel.getDate()); //initialize color

        //Listen for changes on the date spinner.
        dateSpinner.addChangeListener(this);

        //Lay out the panel.
        SpringUtilities.makeCompactGrid(this,
                                        numPairs, 2, //rows, cols
                                        10, 10,        //initX, initY
                                        6, 10);  
        //xPad, yPad
         e = (Date) spinner.getValue();
         System.out.println(e);
    }

    /**
     * Return the formatted text field used by the editor, or
     * null if the editor doesn't descend from JSpinner.DefaultEditor.
     */
    public JFormattedTextField getTextField(JSpinner spinner) {
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            return ((JSpinner.DefaultEditor)editor).getTextField();
        } else {
            System.err.println("Unexpected editor type: "
                               + spinner.getEditor().getClass()
                               + " isn't a descendant of DefaultEditor");
            return null;
        }
    }

    /**
     * Required by the ChangeListener interface. Listens for
     * changes in the date spinner and does something silly in
     * response.
     */
    public void stateChanged(ChangeEvent e) {
        SpinnerModel dateModel = dateSpinner.getModel();
        if (dateModel instanceof SpinnerDateModel) {
            //setSeasonalColor(((SpinnerDateModel)dateModel).getDate());
        }
    }


    static protected JSpinner addLabeledSpinner(Container c,
                                                String label,
                                                SpinnerModel model) {
        JLabel l = new JLabel(label);
        c.add(l);

        JSpinner spinner = new JSpinner(model);
        l.setLabelFor(spinner);
        c.add(spinner);

        return spinner;
    }

    public Date findDate() {
    	return (Date) spinner.getValue();
    }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
//    private static void createAndShowGUI() {
//        //Create and set up the window.
//        JFrame frame = new JFrame("Set Date and Time");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //Add content to the window.
//        frame.add(new Spinner(true));
//        JPanel panel = new JPanel();
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }


	
}
