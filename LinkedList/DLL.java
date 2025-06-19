public class DLL {

    // Basic node declaration
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
    public void insertAtBeginning() {
        Node newnode = new Node(8);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.back = newnode;
            head = newnode;
        }
    }

    // Insert at end
    public void insertAtend() {
        Node newnode = new Node(9);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.back = temp;
        }
    }

    // Insert at a given position (1-based index)
    public void insertAtAPos(int pos) {
        Node newnode = new Node(78);

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null && pos != 1) {
            System.out.println("Empty list. Can only insert at position 1.");
            return;
        }

        if (pos == 1) {
            insertAtBeginning();
            return;
        }

        Node temp = head;
        int i = 1;
        while (i < pos - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        newnode.back = temp;

        if (temp.next != null) {
            temp.next.back = newnode;
        }

        temp.next = newnode;
    }

    // Display the list
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

    //delete head from DLL 
    public void delbegnode(){

        Node temp=head;
        if(head==null){
            System.out.println("List empty");
        }
        else{
                head = head.next;
                if (head != null) {
                    head.back = null;
                }
        }
    }

    // delete node at the  end 
    public void delnodeAtEnd(){
     if(head == null){
        System.out.println("List empty");
        return;
     }

     if(head.next == null){
        head = null;
        return;
     }

     Node temp = head;
     while(temp.next != null){
        temp = temp.next;
     }

     temp.back.next = null;
    }


    //del at specific position
    public void delatPos(int pos){
     if(head == null){
        System.out.println("List empty");
        return;
     }

     if(pos == 1){
        delbegnode();  // reuse karo
        return;
     }

     Node temp = head;
     int i = 1;
     while(i < pos && temp != null){
        temp = temp.next;
        i++;
     }

     if(temp == null){
        System.out.println("Position out of bounds");
        return;
     }

     if(temp.next != null){
        temp.next.back = temp.back;
     }

     if(temp.back != null){
        temp.back.next = temp.next;
     }
    }


    // Main method
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtBeginning();  // 8
        list.insertAtend();        // 8 -> 9
        list.insertAtAPos(2);      // 8 -> 78 -> 9

        list.displayDll();         // Output: 8 -> 78 -> 9 -> null
    }
}
