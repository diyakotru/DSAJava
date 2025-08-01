package DSAJava.StacksandQueues;

public class QueueusingLL {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node start;
    Node end;

    void push(int x) {
        Node newnode = new Node(x); // fixed
        if (start == null) {
            start = end = newnode;
        } else {
            end.next = newnode;
            end = newnode;
        }
    }

    void pop() {
        if (start == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (start == end) {
            start = end = null;
        } else {
            start = start.next;
        }
    }

    void peek() {
        if (start == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + start.val);
    }

    void size() {
        Node temp = start;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size: " + count);
    }

    public static void main(String[] args) {
        QueueusingLL queue = new QueueusingLL();
        queue.push(0);
        queue.push(6);
        queue.push(78);
        queue.pop();
        queue.peek();   //  print 6
        queue.size();   //  print 2
    }
}
