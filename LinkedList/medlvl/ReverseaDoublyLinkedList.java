package medlvl;
public class ReverseaDoublyLinkedList {
    static class Node {
        int val;
        Node next;
        Node back;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.back = null;
        }
    }

    Node head;

    // Insert at beginning
    public void insertAtBeginning(int x) {
        Node newnode = new Node(x);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.back = newnode;
            head = newnode;
        }
    }
    public void displayDll() {
        if (head == null) {
            System.out.println("Empty DLL");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public Node reverseDll(){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.back=next;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        ReverseaDoublyLinkedList list=new ReverseaDoublyLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(45);
        list.insertAtBeginning(22);
        list.insertAtBeginning(10);
        list.head= list.reverseDll();
        list.displayDll();


    
    }
}
