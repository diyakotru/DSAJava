public class traversalsearch {
    Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to insert a new node at the end
    public void insert(int value) {
        Node newNode = new Node(value);
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

    // Method to count nodes in the linked list
    public void countnodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Number of nodes: " + count);
    }

    //Search for an element
    public void search(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                System.out.println("Present");
                return;
            }
        
            temp=temp.next;
        }
        System.out.println("NotPresent");

    }

    // Main method to test the linked list
    public static void main(String[] args) {
        traversalsearch list = new traversalsearch();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.countnodes();  // Output: Number of nodes: 3
        list.search(20); //Output: Present
        list.search(60); //Output: Not Present
    }
}
