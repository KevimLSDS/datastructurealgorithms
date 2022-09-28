package lists.linkedlists.doubly;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode newNode = new EmployeeNode(employee);

        /*
         * Check whether the list is empty
         * If yes, then set the tail to the current node we're inserting
         * If not, then set "previous node" of the current item in the list to be the item we're inserting
         */
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }

        // Set the head to the new item and increase the list size
        head = newNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);

        /*
         * Check whether the list is empty
         * If yes, set the head to the node we're inserting
         * If not, set the tail's next node to be the node we're inserting; then update the new node's previous item
         */
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }

        // Set the tail to the new item and increase the list size
        tail = newNode;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        // Store the removed item to be returned
        EmployeeNode removedNode = head;

        // Check if it's the only item in the list to clear the tail
        if (head.getNext() == null) {
            tail = null;
        } else {
            // Clear the previous item from the remaining head node
            head.getNext().setPrevious(null);
        }

        // Set the head to point to the next item in the list and decrement the size
        head = head.getNext();
        size--;

        // Clear the references
        removedNode.setNext(null);

        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        // Store the removed item to be returned
        EmployeeNode removedNode = tail;

        // Check if it's the only item in the list to clear the head node
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            // Clear the next item from the remaining tail node on the list
            tail.getPrevious().setNext(null);
        }

        // Set the tail to point to the previous item in the list and decrement the size
        tail = tail.getPrevious();
        size--;

        // Clear the references
        removedNode.setPrevious(null);

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
            System.out.print(" <=> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
