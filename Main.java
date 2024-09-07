import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Departments
        Department salesDept = new Department("Sales");
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");
        Department financeDept = new Department("Finance");
        Department managementDept = new Department("Management");
        // Create employees
        Employee jimmy = new Employee("Jimmy", 3000, "Sales Representative", salesDept);
        Employee jeffray = new Employee("Jeffray  Way", 6000, "PHP Developer", itDept);
        Employee sanntintaung = new Employee("Sann Tint Aung", 6000, "Rust Developer", itDept);
        Employee taylor = new Employee("Tayler Owell", 9000, "Software architech", itDept);
        Employee john = new Employee("John", 4000, "HR manager", hrDept);
        Employee jane = new Employee("Jane", 5000, "Accountant", financeDept);
        Employee jenny = new Employee("Jenny", 7000, "Finance Manager", financeDept);
        Employee jessica = new Employee("Jessica", 8000, "Finance Director", financeDept);
        Employee johnDoe = new Employee("John Doe", 100000, "CEO", managementDept);
        Employee janeDoe = new Employee("Jane Doe", 100000, "CTO", itDept);

        // Set department managers
        salesDept.setManager(jimmy);
        itDept.setManager(taylor);
        hrDept.setManager(john);

        Employee[] employees = { jimmy, jeffray, sanntintaung, taylor, john, jane, jenny, jessica, johnDoe, janeDoe };

        System.out.println("SoftDev Employee Records:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getPosition() +
                    " in " + emp.getDepartment().getName() +
                    " department, Salary: $" + emp.getSalary());
        }

        // Demonstrate employee management
        System.out.println("Initial employee details:");
        printEmployeeDetails(jimmy);
        printEmployeeDetails(jeffray);
        printEmployeeDetails(taylor);
        printEmployeeDetails(john);

        // Promote an employee
        jeffray.promote("Senior PHP Developer", 8000);
        System.out.println("\nAfter promotion:");
        printEmployeeDetails(jeffray);

        // Transfer an employee
        john.transfer(financeDept);
        System.out.println("\nAfter transfer:");
        printEmployeeDetails(john);

        // Record attendance
        Attendance johnAttendance = new Attendance(john, new Date(), new Date());
        johnAttendance.setTimeOut(new Date(System.currentTimeMillis() + 28800000)); // 8 hours later
        System.out.println("\nAttendance record for John:");
        System.out.println("Hours worked: " + johnAttendance.calculateHoursWorked());
        System.out.println("Overtime: " + johnAttendance.isOverTime());

        // Add a performance review
        PerformanceReview jeffrayReview = new PerformanceReview(jeffray, new Date());
        jeffrayReview.setRating(4);
        jeffrayReview.setComments("Excellent work on the latest project.");
        jeffrayReview.addGoal("Learn a new programming language");
        System.out.println("\nPerformance review for Jane:");
        printPerformanceReview(jeffrayReview);
    }

    private static void printEmployeeDetails(Employee emp) {
        System.out.println(emp.getName() + " - " + emp.getPosition() +
                " in " + emp.getDepartment().getName() +
                " department, Salary: $" + emp.getSalary());
    }

    private static void printPerformanceReview(PerformanceReview review) {
        System.out.println("Employee: " + review.getEmployee().getName());
        System.out.println("Date: " + review.getReviewDate());
        System.out.println("Rating: " + review.getRating());
        System.out.println("Comments: " + review.getComments());
        System.out.println("Goals: " + review.getGoals());
    }
}