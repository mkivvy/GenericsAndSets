package Labs313;

import java.util.Comparator;

/**
 * Allows Employee class objects to be sorted by the employee's first name
 * @author Mary
 */
public class EmployeeByFirstName implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }

}
