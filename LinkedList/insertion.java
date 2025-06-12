public class insertion {
    //beginning 
    //end 
    //certain pos
    Node head;
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public void addInBeginning(int x){
        Node newnode=new Node (x);
        newnode.next=head;
        head=newnode;
    }

    public void addAtEnd(int x){
        Node newnode=new Node(x);
        Node temp=head;
        if (head == null) {
            head = newnode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }

    public void addAtAnyPos(int pos,int x){
        Node temp=head;
        Node prev=null;
        Node newnode=new Node(x);
        int i=1;
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }

        while(i<pos){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=newnode;
        newnode.next=temp;
    }

    public static void main(String[] args) {
        insertion list=new insertion();
        list.addInBeginning(67);
        list.addInBeginning(17);
        list.addInBeginning(90);
        list.addAtEnd(100);
        list.addAtAnyPos(2,07);
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.val+" -> " );
            temp=temp.next;
        }
       
    }
}
