package Labs313;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Mary
 */
public class Lab4 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Bee", "Miles", "123123123");
        Employee e2 = new Employee("Ransford", "Phillip", "454545454");
        Employee e3 = new Employee("Candymaker", "Logan", "369369369");
        Employee e4 = new Employee("Carpenter", "Daisy", "123123123");
        Employee e5 = new Employee("Carpenter", "Daisy", "444444444");
        Employee e6 = new Employee("Pinkus", "Max", "999999999");

        Set<Employee> empSet = new TreeSet<Employee>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        empSet.add(e5);

        System.out.println("Printing each employee using loop:");
        for (Employee e : empSet) {
            System.out.println(e);
        }
        System.out.println("Size = " + empSet.size());
        
        System.out.println("\nPrinting values of employee using a collection of values:");
        System.out.println("notice the values are still sorted by ssn");
        Collection<Employee> empValues = empSet;
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
        
        Employee eOut = null;
        System.out.println("\nPrinting each employee using iterator loop:");
        List <Employee> empList = new ArrayList<Employee>(empSet);
        Iterator<Employee> i = empList.iterator();
        while( i.hasNext() ) {
            eOut = i.next();
            System.out.println(eOut);
        }

        // Yet another alternative looping strategy using Iterator
        // Notice the increment field of the for loop is empty
        System.out.println("\nPrinting each employee using another iterator loop:");
        for(Iterator<Employee> itr = empList.iterator(); itr.hasNext(); ) {
            eOut = itr.next();
            System.out.println(eOut);
        }

        // List iterator allows you to traverse the list backwards:
//        System.out.println("\nPrinting each employee w/ list iterator loop:");
////       for(ListIterator<Employee> lit = empList.listIterator(); lit.hasPrevious(); ) {
//        ListIterator<Employee> lit = empList.listIterator(); 
//        while (lit.hasNext()) {
//            eOut = lit.next();
//            System.out.println(eOut);
//        }
        //Note: I tried this w/o the previous loop and nothing output - I think the
        //listiterator needs to be set at the last position before it can go backwards
        //Can this be done w/o having to read thru list first? start position = end?
        //YES!! When created, use the list's size method to position at end!  This works!
        System.out.println("\nPrinting each employee in reverse order w/ list iterator loop:");
        //Here I now define the listierator & position it at the end
        ListIterator<Employee> lit = empList.listIterator(empList.size()); 
        while (lit.hasPrevious()) {
            eOut = lit.previous();
            System.out.println(eOut);
        }
        
    }
}
