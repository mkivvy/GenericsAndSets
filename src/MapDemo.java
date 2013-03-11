
import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
//        Map<String, Employee> map = new HashMap<String, Employee>();
        Map<String, List> map = new HashMap<String, List>();
        
        Employee e1 = new Employee("Jones", "Bob", "333-33-3333");
        Employee e2 = new Employee("Smith", "Tracy", "444-44-4444");

//        map.put("333-33-3333", e1);
//        map.put("444-44-4444", e2);
//        Employee emp = map.get("333-33-3333");
//        System.out.println(emp);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        map.put("employee list", empList);
        empList = map.get("employee list");
        System.out.println(empList.get(1));
        System.out.println(empList);
    }
}
