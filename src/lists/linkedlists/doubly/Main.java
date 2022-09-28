package lists.linkedlists.doubly;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee bill = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        list.printList();
        System.out.println("Size: " + list.getSize());

        System.out.println();
        list.addToEnd(bill);
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFromFront();
        System.out.println();
        System.out.println("List after removing from the front: ");
        list.printList();
        System.out.println("Size after removing: " + list.getSize());

        list.removeFromEnd();
        System.out.println();
        System.out.println("List after removing from the end: ");
        list.printList();
        System.out.println("Size after removing: " + list.getSize());
    }
}
