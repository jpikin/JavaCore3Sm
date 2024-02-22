import ComparatorClasses.NameComparator;
import Decorators.Decorator;
import Employees.Emploee;
import Employees.Freelancer;
import Employees.Worker;


import java.util.*;


public class App {
    public static void main(String[] args) {

        Emploee freelancer = new Freelancer("Nikolay", 1982,450d);
        Emploee worker = new Worker("Aleksey", 1990, 60000d);
        Emploee worker2 = new Worker("Artem", 1976,100000d);

        ArrayList<Emploee> emploeesArray = new ArrayList<>();
        emploeesArray.add(freelancer);
        emploeesArray.add(worker);
        emploeesArray.add(worker2);

        Collections.sort(emploeesArray);
        Decorator.printDecorator(emploeesArray);
        System.out.println();

        Comparator<Emploee> nameComparator = new NameComparator();
        emploeesArray.sort(nameComparator);
        Decorator.printDecorator(emploeesArray);

        }
            }

