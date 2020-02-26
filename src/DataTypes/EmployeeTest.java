package DataTypes;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Mauro Palese", 100000);

        employee.raiseSalary(20);
        employee.printInfo();
    }
}
