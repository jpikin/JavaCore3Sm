package Employees;

import java.util.Comparator;


public abstract class Emploee implements Comparable<Emploee> {
    protected String name;
    protected int birthYear;
    public abstract Double averageSalary();
    public String getName() {
        return this.name;
    }
    @Override
    public int compareTo(Emploee o) {
        return this.averageSalary().compareTo(o.averageSalary());
    }

}
