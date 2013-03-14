package Labs313;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mary
 */
public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bee", "Miles", "123123123");
        Employee e2 = new Employee("Ransford", "Phillip", "454545454");
        Employee e3 = new Employee("Candymaker", "Logan", "369369369");
        Employee e4 = new Employee("Carpenter", "Daisy", "123123123");
        
        Map<String, Employee> empMap = new HashMap<String, Employee>();
        empMap.put("123123123", e1);
        empMap.put("454545454", e2);
        empMap.put("369369369", e3);
        empMap.put("123123123", e4);
        
        System.out.println("Printing each employee using non-loop get:");
        System.out.println("1. " + empMap.get("123123123"));
        System.out.println("2. " + empMap.get("454545454"));
        System.out.println("3. " + empMap.get("369369369"));
        System.out.println("4. " + empMap.get("123123123"));
        System.out.println("Size = " + empMap.size());
        
        System.out.println("\nPrinting each employee using a key set loop get:");
        Set<String> empKeys = empMap.keySet();
        for (String key: empKeys) {
            Employee e = (Employee)empMap.get(key);
            System.out.println("key=" + key + ", " + e.toString());
        }

        System.out.println("\nPrinting values of employee using a collection of values:");
        Collection<Employee> empValues = empMap.values();
        for (Employee value: empValues) {
            System.out.println(value);
        }
    }
}
