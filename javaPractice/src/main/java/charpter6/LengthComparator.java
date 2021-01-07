package charpter6;

import java.util.Comparator;

public class LengthComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
