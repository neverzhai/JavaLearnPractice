package charpter6;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary,int rank, double bonus) {
        super(name, salary, rank);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if (getClass() != otherEmployee.getClass()){
            return Integer.compare(getRank(), otherEmployee.getRank());
        }

        Manager other = (Manager) otherEmployee;
        return Double.compare(getSalary() + bonus, other.getSalary() + other.bonus);
    }
}
