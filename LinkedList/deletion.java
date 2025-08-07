public class deletion {
    Node head;

    static class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null;
        }
    }

    // Delete node at the beginning
    public void delNodeAtBeg() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    // Delete node at the end -> O(n)
    public void delNodeAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            // Only one node in the list
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
    }

    // Delete node at a specific position (0-based index)
    public void delAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        int i = 0;

        while (i < pos && temp != null) {
            prev = temp;
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds. Cannot delete.");
            return;
        }

        prev.next = temp.next;
    }

    // Utility: Add node at the end
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Utility: Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deletion list = new deletion();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.printList();  // 10 -> 20 -> 30 -> 40 -> null

        list.delNodeAtBeg();
        list.printList();  // 20 -> 30 -> 40 -> null

        list.delNodeAtEnd();
        list.printList();  // 20 -> 30 -> null

        list.delAtPos(1);
        list.printList();  // 20 -> null

        list.delAtPos(5);  // Position out of bounds
        list.printList();  // 20 -> null

        list.delNodeAtEnd();
        list.printList();  // List is empty
    }
}
