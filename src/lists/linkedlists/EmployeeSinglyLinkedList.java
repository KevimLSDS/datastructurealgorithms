package lists.linkedlists;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        // Create a node and then set the head to be the next item
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        // Set the head to the new item and increase the list size
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        // Store the removed item to be returned
        EmployeeNode removedNode = head;

        // Set the head to point to the next item in the list and decrement the size
        head = head.getNext();
        size--;

        // Clear the references
        removedNode.setNext(null);

        return removedNode;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
