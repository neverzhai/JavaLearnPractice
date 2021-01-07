package charpter6;

import java.util.Arrays;

public class EmployeeCompareTest {
    public static void main(String args[]){

        //two employee
        Employee zhai = new Employee("never.zhai", 100, 0);
        Employee zhang = new Employee("zhang", 200, 0);
        Employee[] staff = new Employee[] {zhai, zhang};
        Arrays.sort(staff);

        System.out.println("Compare by salary");
        for (Employee e : staff){
            System.out.println("employee name: "+e.getName());
        }

        System.out.println("compare by name length");
        Arrays.sort(staff, new LengthComparator());
        for (Employee e: staff){
            System.out.println("employee by name length: " + e.getName());
        }

        // two manager
        Manager manager1 = new Manager("manager1", 300, 1, 120);
        Manager manager2 = new Manager("manager2", 200,1, 120);

        Manager[] managers = new Manager[] {manager1, manager2};
        Arrays.sort(managers);
        for (Manager m : managers) {
            System.out.println("manager name: "+ m.getName());
        }

        //one employee and one manager
        Employee employee = new Employee("employee", 400, 0);
        Employee manager = new Manager("manager", 200, 1,10);

        Employee[] staff1 = new Employee[] {employee, manager};
        Arrays.sort(staff1);
        for (Employee e: staff1) {
            System.out.println("employee or manager name: " + e.getName());
        }
    }
}
