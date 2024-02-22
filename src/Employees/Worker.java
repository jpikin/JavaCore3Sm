package Employees;

public class Worker extends Emploee{
    private Double salary;

    public Worker(String name, int birthYear, Double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }
    @Override
    public Double averageSalary() {
        return this.salary;
    }
}
