package charpter5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee  extends Person{

    private double salary;
    private LocalDate hireDay;
    private Object obj = new int[10];

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Employee employee = (Employee) otherObject;
        return Double.compare(employee.salary, salary) == 0 &&
                hireDay.equals(employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hireDay=" + hireDay +
                "} " + super.toString();
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    @Override
    public String getDescription() {
        return "I am a developer";
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
