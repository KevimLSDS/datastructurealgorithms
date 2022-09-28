package lists.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        Employee mary = new Employee("Mary", "Smith", 22);
        employeeList.add(mary);
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(System.out::println);
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4540));

        employeeList.add(3, new Employee("John", "Doe", 4567));

//        System.out.println("Size: " + employeeList.size());
//        employeeList.forEach(System.out::println);

//        Employee[] employeeArray = employeeList.toArray(new Employee[0]);
//
//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println("Contains: " + employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println("Index of \"John Doe\": " + employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);

        employeeList.forEach(System.out::println);
    }
}
