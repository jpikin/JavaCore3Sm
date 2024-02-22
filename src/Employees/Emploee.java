package Employees;

public abstract class Emploee {
    protected String name;
    protected int birthYear;
    public abstract Double averageSalary();
    public String getName() {
        return this.name;
    }
}
