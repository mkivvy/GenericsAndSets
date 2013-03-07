package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab2 {
    public static void main(String[] args) {
        Address a1 = new Address("123 Main St.", "", "Springfield", "5551234", "");
        Address a2 = new Address("122 Spruce Lane", "", "Glenwood", "5555523", "dkhere@yahoo.com");
        Address a3 = new Address("1234 Wood St.", "", "Griffith", "5550530", "itsus@gmail.com");
        Address a4 = new Address("4324 Main St.", "", "Normal", "5551208", "lauralovescheese@gmail.com");
        Address a5 = new Address("123 Main St.", "", "Springfield", "5551234", "");
        
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);
        addresses.add(a4);
        addresses.add(a5);
        System.out.println("Original list length = " + addresses.size());
        for (Address a : addresses) { 
            System.out.println(a);
        }
        
        //populate a set to remove duplicates
        Set<Address> addressSet = new HashSet<Address>(addresses);
        //move back to list and see if dups are gone
        addresses = new ArrayList<Address>(addressSet);
        System.out.println("Duplicates list length = " + addresses.size());
        for (Address a : addresses) { 
            System.out.println(a);
        }
        
    }

}
