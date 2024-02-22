package Employees;

import java.util.ArrayList;

public class ArrayEmployees {
    public ArrayList<Emploee> createArrayList() {
        ArrayList<Emploee> emploeesArray = new ArrayList<>();
        Emploee freelancer = new Freelancer("Nikolay", 1982, 450d);
        Emploee worker = new Worker("Aleksey", 1990, 60000d);
        Emploee worker2 = new Worker("Artem", 1976, 100000d);
        emploeesArray.add(freelancer);
        emploeesArray.add(worker);
        emploeesArray.add(worker2);
        return emploeesArray;
    }
}
