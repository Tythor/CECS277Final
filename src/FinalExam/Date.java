package FinalExam;
public class Date  {
    private int month;
    private int day;
    private int year;

    public Date() {}

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
public class Date {
	
	    private int month;
	    private int day;
	    private int year;

	    public Date() {}

	    public Date(int month, int day, int year) {
	        this.month = month;
	        this.day = day;
	        this.year = year;
	    }

	    public int getMonth() {
	        return month;
	    }

	    public int getDay() {
	        return day;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setMonth(int month) {
	        this.month = month;
	    }

	    public void setDay(int day) {
	        this.day = day;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return "Date{" +
	                "month=" + month +
	                ", day=" + day +
	                ", year=" + year +
	                '}';
	    }
	}

