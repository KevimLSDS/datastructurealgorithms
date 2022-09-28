package lists.linkedlists.singly;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

        System.out.println("Is empty? " + list.isEmpty());

        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        System.out.println("Size: " + list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println("\nSize after one removal: " + list.getSize());
        System.out.println("List after one removal: ");
        list.printList();
    }
}
