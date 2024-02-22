package ComparatorClasses;

import Employees.Emploee;

import java.util.Comparator;

public class nameComparator implements Comparator<Emploee> {

    @Override
    public int compare(Emploee o1, Emploee o2) {
        return 0; //o1.averageSalary() - o2.averageSalary();
    }
}
