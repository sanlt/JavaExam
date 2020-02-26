package DataTypes;

public class Employee {
    String employeeName;
    double currentSalary;
    double salary;
    double raise;

    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        salary = currentSalary;
    }

    public String getName() {
        return employeeName;
    }

    public double getSalary() {
        return currentSalary;
    }

    public void raiseSalary(double byPercent) {
        raise = byPercent / 100;
        raise += 1;
        currentSalary = salary * raise;
    }

    public void printInfo() {
        System.out.println(employeeName + " ears " + currentSalary + " a year");
    }
}
