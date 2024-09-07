import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class PerformanceReview {
    private Employee employee;
    private Date reviewDate;
    private int rating;
    private String comments;
    private List<String> goals;

    public PerformanceReview(Employee employee, Date reviewDate) {
        this.employee = employee;
        this.reviewDate = reviewDate;
        this.goals = new ArrayList<>();
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    public List<String> getGoals() {
        return new ArrayList<>(goals);
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void addGoal(String goal) {
        goals.add(goal);
    }
}