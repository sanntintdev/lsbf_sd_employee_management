import java.util.ArrayList;
import java.util.Date;

public class Attendance {
    private Employee employee;
    private Date date;
    private Date timeIn;
    private Date timeOut;

    public Attendance(Employee employee, Date date, Date timeIn) {
        this.employee = employee;
        this.date = date;
        this.timeIn = timeIn;
    }

    public double calculateHoursWorked() {
        if (timeOut == null) {
            return 0;
        }
        long diff = timeOut.getTime() - timeIn.getTime();
        return diff / (1000.0 * 60 * 60); // converts milliseconds to hours
    }

    public boolean isOverTime() {
        return calculateHoursWorked() > 8; // assuming 8 hours is the standard working hours
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getDate() {
        return date;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }
}