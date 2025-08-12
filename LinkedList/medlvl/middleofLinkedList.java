package medlvl;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class middleofLinkedList {
    static Node head; 

    public static void addInBeginning(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    static void bruteforce(Node head) {
        // Step 1: count nodes
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: go to middle node
        int midIndex =(count / 2)+1;
        temp = head;
        int val=1;
        while(temp!=null){
            if(val==midIndex){
                break;
            }
            val++;
            temp=temp.next;
        }

        System.out.println("Middle node value (Bruteforce): " + temp.val);
    }

    static void optimalApproach(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.val);
    }

    public static void main(String[] args) {
        addInBeginning(67);
        addInBeginning(17);
        addInBeginning(90);
        addInBeginning(290);
        addInBeginning(2);
        addInBeginning(89);

        bruteforce(head); 
        optimalApproach(head);
    }
}
