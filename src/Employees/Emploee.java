package Employees;

import java.util.Comparator;


public abstract class Emploee implements Comparator<Emploee> {
    protected String name;
    protected int birthYear;
    public abstract Double averageSalary();
    public String getName() {
        return this.name;
    }
    @Override
    public int compare(Emploee o1, Emploee o2) {
        return 0;
    }

}
