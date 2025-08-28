package medlvl;

public class sort012 {
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
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node sortLL(){
        int c1=0;
        int c0=0;
        int c2=0;
        Node temp=head;
        Node newhead=null;

        // Count 0s, 1s, 2s
        while(temp!=null){
            if(temp.val==0){
                c0++;
            }
            else if(temp.val==1){
                c1++;
            }
            else if(temp.val==2){
                c2++;
            }
            temp=temp.next;
        }

        // Insert 0s
        while(c0!=0){
            Node newnode=new Node(0);
            if(newhead==null){
                newhead=newnode;
            }else{
                Node temp2=newhead;
                while(temp2.next!=null){
                    temp2=temp2.next;
                }
                temp2.next=newnode;
            }
            c0--;
        }

        // Insert 1s
        while(c1!=0){
            Node newnode=new Node(1);
            Node temp2=newhead;
            while(temp2.next!=null){
                temp2=temp2.next;            
            }
            temp2.next=newnode;
            c1--;
        }

        // Insert 2s
        while(c2!=0){
            Node newnode=new Node(2);
            Node temp2=newhead;
            while(temp2.next!=null){
                temp2=temp2.next;            
            }
            temp2.next=newnode;
            c2--;
        }

        return newhead;  

    }
    public Node sortoptimal(){
        Node zeroD = new Node(-1), oneD = new Node(-1), twoD = new Node(-1);
        Node zero = zeroD, one = oneD, two = twoD;

        Node temp = head;

        // distribute into 3 buckets
        while (temp != null) {
            if (temp.val == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // stitch lists together: zero → one → two
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null; // terminate

        // new head = first non-empty list
        return (zeroD.next != null) ? zeroD.next :
               (oneD.next != null ? oneD.next : twoD.next);
    }


    public static void main(String[] args) {
        sort012 list=new sort012();
        list.addInBeginning(0);
        list.addInBeginning(1);
        list.addInBeginning(1);
        list.addInBeginning(0);
        list.addInBeginning(0);
        list.addInBeginning(0);
        list.addInBeginning(2);
        list.addInBeginning(2);
        list.addInBeginning(2);
        //list.head=list.sortLL();
        list.head=list.sortoptimal();
        list.printList();

    }
}
