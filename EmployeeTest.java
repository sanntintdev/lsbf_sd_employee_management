import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee;
    private Department salesDepartment;
    private Department marketingDepartment;

    @Before
    public void setUp() {
        salesDepartment = new Department("Sales");
        marketingDepartment = new Department("Marketing");
        employee = new Employee("John Doe", 50000, "Sales Representative", salesDepartment);
    }

    @Test
    public void testPromoteEmployee() {
        // Test case 1: Promoting an employee
        employee.promote("Senior Sales Representative", 10000);

        assertEquals("Senior Sales Representative", employee.getPosition());
        assertEquals(10000, employee.getSalary(), 0.01);
        System.out.println("Test 1 (Promote Employee) passed successfully.");
    }

    @Test
    public void testTransferEmployee() {
        // Test case 2: Transferring an employee to a new department
        employee.transfer(marketingDepartment);

        assertEquals(marketingDepartment, employee.getDepartment());
        assertFalse(salesDepartment.getEmployeeCount() > 0);
        System.out.println("Test 2 (Transfer Employee) passed successfully.");
    }
}