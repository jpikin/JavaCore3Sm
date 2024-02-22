import Employees.Emploee;
import Employees.Freelancer;
import Employees.Worker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class App {
    public static void main(String[] args) {
        Emploee freelancer = new Freelancer("Nikolay", 1982,450d);
        Emploee worker = new Worker("Aleksey", 1976, 60000d);

        System.out.println("Средняя зарплата " + freelancer.getName() +": " +freelancer.averageSalary());
        System.out.println("Средняя зарплата " + worker.getName() +": "+ worker.averageSalary());

        ArrayList<Emploee> emploeesArray = new ArrayList<>();
        emploeesArray.add(freelancer);
        emploeesArray.add(worker);

        Collections.sort(emploeesArray);


            }
}
