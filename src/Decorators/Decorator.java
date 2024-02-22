package Decorators;

import Employees.Emploee;

import java.util.ArrayList;

public class Decorator {

    public static void printDecorator(ArrayList<Emploee> arrayList) {
        for (Emploee a: arrayList) {
            System.out.println("Средняя зарплата " + a.getName() +": " +a.averageSalary());
        }
    }
}
