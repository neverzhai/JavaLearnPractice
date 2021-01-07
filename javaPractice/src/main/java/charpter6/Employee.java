package charpter6;

public class Employee implements Comparable<Employee>, Cloneable{

    private String name;
    private double salary;
    private int rank;

    public Employee(String name, double salary, int rank) {
        this.name = name;
        this.salary = salary;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getRank() {
        return rank;
    }


    public Employee clone() throws CloneNotSupportedException {
       Employee cloned =  (Employee)super.clone();
       return cloned;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Double.compare(salary, otherEmployee.salary);
    }
}
