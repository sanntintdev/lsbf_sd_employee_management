import java.util.List;
import java.util.ArrayList;

public class Department {
    private int departmentId;
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void updateProfile(String departmentName, Employee newManager) {
        String oldName = this.name;
        this.name = departmentName;
        this.manager = newManager;
        System.out.println("Department updated: " + oldName + " is now " + this.name +
                " with new manager " + newManager.getName());
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public void setManager(Employee employee) {
        this.manager = employee;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
