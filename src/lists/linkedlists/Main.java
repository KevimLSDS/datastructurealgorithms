package lists.linkedlists;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        list.printList();
    }
}
