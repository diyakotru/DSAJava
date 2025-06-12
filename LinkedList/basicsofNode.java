public class basicsofNode{
   
    //Creation of a Node( value + Pointer) 
    static class Node{
        int val ;
        Node next;

        //Constructor : Create n assign value to object 
         Node(int val){
            this.val=val;
            this.next=null;
         }
    }
    //head points to the beginning of the ll
    Node head;

    public void addFirst(int val) {
    Node newNode = new Node(val); // Create new node
    newNode.next = head;          // Point to old head
    head = newNode;               // Update head
    }

    //Displaying the ll
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main (String args[]){
      basicsofNode list = new basicsofNode();
      list.addFirst(30);
      list.addFirst(48);
      list.addFirst(89);
      list.printList();
    }
}