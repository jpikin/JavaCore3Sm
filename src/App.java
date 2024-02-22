import Employees.Emploee;
import Employees.Freelancer;
import Employees.Worker;


public class App {
    public static void main(String[] args) {
        Emploee freelancer = new Freelancer("Nikolay", 1982,450d);
        Emploee worker = new Worker("Aleksey", 1976, 60000d);

        System.out.println("Средняя зарплата " + freelancer.getName() +": " +freelancer.averageSalary());
        System.out.println("Средняя зарплата " + worker.getName() +": "+ worker.averageSalary());
    }
}
