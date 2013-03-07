package common;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Goodman", "Benny", "123456789");
        Employee e2 = new Employee("Fitzgerald", "Ella", "123123123");
        Employee e3 = new Employee("Cohen", "Anat", "123456789");
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        for (Employee e : empList) {
            System.out.println(e);
        }

        Address a1 = new Address("122 Spruce Lane", "", "Glenwood", "5555523", "dkhere@yahoo.com");
        Address a2 = new Address("1234 Wood St.", "", "Griffith", "5550530", "itsus@gmail.com");
        Address a3 = new Address("4324 Main St.", "", "Normal", "5551208", "lauralovescheese@gmail.com");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);
        for (Address a : addresses) {
            System.out.println(a);
        }

        Dog d1 = new Dog("Tag", 123);
        Dog d2 = new Dog("Doodles", 456);
        Dog d3 = new Dog("Scribbles", 789);
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        for (Dog d : dogs) {
            System.out.println(d);
        }

    }
}
