package Employees;

public class Freelancer extends Emploee{

    private Double salaryHour;

    public Freelancer(String name, int birthYear, Double salaryHour) {
        this.name = name;
        this.birthYear = birthYear;
        this.salaryHour = salaryHour;
    }

    @Override
    public Double averageSalary() {
        return this.salaryHour * 20.8 * 8;
    }
}
