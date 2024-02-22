import ComparatorClasses.NameComparator;
import Decorators.Decorator;
import Employees.ArrayEmployees;
import Employees.Emploee;
import Employees.Freelancer;
import Employees.Worker;


import java.util.*;


public class App {
    public static void main(String[] args) {

        ArrayEmployees arrayEmployees = new ArrayEmployees();
        ArrayList<Emploee> emploeesArray = arrayEmployees.createArrayList();
        Collections.sort(emploeesArray);
        Decorator.printDecorator(emploeesArray);
        System.out.println();

        Comparator<Emploee> nameComparator = new NameComparator();
        emploeesArray.sort(nameComparator);
        Decorator.printDecorator(emploeesArray);

    }
}

