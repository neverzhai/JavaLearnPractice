package charpter4;

import java.util.Random;

/**
 * A Employee object
 * @author shuanger.zhai
 * @version 1.0.0
 *
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    // static initialization block
    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }


    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public Employee(String name) {
        this.name = name;
    }

    /**
     * Raises the salary of an empoyee
     * @param byPercent the percentage by which to raise the salary
     * @return the amount of salary
     */
    public double raisesalary(double byPercent) {
        return salary += salary * byPercent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}