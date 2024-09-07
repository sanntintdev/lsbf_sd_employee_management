import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String position;
    private Department department;
    private Date hireDate;

    public Employee(String name, double salary, String position, Department department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.hireDate = new Date(); // Sets hire date to current date
    }

    public void promote(String newPosition, double newSalary) {
        this.position = newPosition;
        this.salary = newSalary;
        System.out.println(this.name + " has been promoted to " + newPosition + " with a salary of " + newSalary);
    }

    public void transfer(Department newDepartment) {
        this.department = newDepartment;
        System.out.println("Transfer successful!");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}