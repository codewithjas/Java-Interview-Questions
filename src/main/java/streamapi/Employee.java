package streamapi;

public class Employee {
    int empId;
    int salary;

    public Employee(int empId, int salary) {
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                '}';
    }
}
