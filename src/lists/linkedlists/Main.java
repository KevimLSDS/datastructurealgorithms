package lists.linkedlists;

import lists.linkedlists.doubly.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee bill = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(jane);
        list.addFirst(john);
        list.addFirst(mary);
        list.addFirst(mike);

        printLinkedList(list);

        System.out.println("\nAdding Bill to the end of the list: ");
        list.add(bill);
        // list.addLast(bill);
        printLinkedList(list);

        System.out.println("\nRemoving the first item: ");
        list.removeFirst();
        printLinkedList(list);

        System.out.println("\nRemoving the last item: ");
        list.removeLast();
        printLinkedList(list);

    }

    public static void printLinkedList(LinkedList<Employee> list) {
        Iterator<Employee> iter = list.iterator();

        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.print(" null\n");
    }
}
