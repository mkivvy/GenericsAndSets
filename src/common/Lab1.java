package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Goodman", "Benny", "123456789");
        Employee e2 = new Employee("Fitzgerald", "Ella", "123123123");
        Employee e3 = new Employee("Cohen", "Anat", "123456789");
        
        Set<Employee> myEmployees = new HashSet<Employee>();
        myEmployees.add(e1);
        myEmployees.add(e2);
        myEmployees.add(e3);
        
        System.out.println("Set contains:");
        for (Employee e : myEmployees) {
            System.out.println(e.getLastName() + ", " + e.getFirstName() 
                    + " " + e.getSsn());
        }
        
        List<Employee> empList = new ArrayList<Employee>(myEmployees);
        System.out.println("List contains:");
        for (Employee e : empList) {
            System.out.println(e.getLastName() + ", " + e.getFirstName() 
                    + " " + e.getSsn());
        }
        
    }

}
