package FinalExam;

/**
 * This class represents a date that includes month, day, and year
 */
public class Date {
    private int month;
    private int day;
    private int year;

    /**
     * Default constructor
     */
    public Date() {}

    /**
     * Constructor that includes month, day, and year
     * @param month
     * @param day
     * @param year
     */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Getter for month
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Getter for day
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter for year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for month
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Setter for day
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Setter for year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * toString that returns Date as a String
     * @return String
     */
    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}

