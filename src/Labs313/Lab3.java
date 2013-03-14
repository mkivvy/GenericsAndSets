package Labs313;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab3 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Bee", "Miles", "123123123");
        Employee e2 = new Employee("Ransford", "Phillip", "454545454");
        Employee e3 = new Employee("Candymaker", "Logan", "369369369");
        Employee e4 = new Employee("Carpenter", "Daisy", "123123123");
        Employee e5 = new Employee("Carpenter", "Daisy", "444444444");

        Map<String, Employee> empMap = new TreeMap<String, Employee>();
        empMap.put("123123123", e1);
        empMap.put("454545454", e2);
        empMap.put("369369369", e3);
        empMap.put("123123123", e4);
        empMap.put("123123123", e5);

        System.out.println("Printing each employee using non-loop get:");
        System.out.println("1. " + empMap.get("123123123"));
        System.out.println("2. " + empMap.get("454545454"));
        System.out.println("3. " + empMap.get("369369369"));
        System.out.println("4. " + empMap.get("123123123"));
        System.out.println("5. " + empMap.get("444444444"));
        System.out.println("Size = " + empMap.size());

        System.out.println("\nPrinting each employee using a key set loop get:");
        System.out.println("notice how the values are sorted by ssn sutomatically!");
        Set<String> empKeys = empMap.keySet();
        for (String key : empKeys) {
            Employee e = (Employee) empMap.get(key);
            System.out.println("key=" + key + ", " + e.toString());
        }

        System.out.println("\nPrinting values of employee using a collection of values:");
        System.out.println("notice the values are still sorted by ssn");
        Collection<Employee> empValues = empMap.values();
        for (Employee value : empValues) {
            System.out.println(value);
        }

        System.out.println("\nPrinting values of employee list sorted by SSN:");
        System.out.println("notice the values are now sorted by first name");
        List<Employee> empSort = new ArrayList<Employee>(empValues);
        Collections.sort(empSort);
        for (Employee eSsn : empSort) {
            System.out.println(eSsn);
        }

        System.out.println("\nPrinting values of employee list sorted by FIRST NAME:");
        System.out.println("notice the values are now sorted by first name");
        Collections.sort(empSort, new EmployeeByFirstName());
        for (Employee e1Name : empSort) {
            System.out.println(e1Name);
        }
    }
}
