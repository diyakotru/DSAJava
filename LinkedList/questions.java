public class questions {
    Node head;
    static class  Node{
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


    //QUESTION-1
    //Remove duplicates from a sorted ll
    // input : 1->1->1->2->2->3
    //output : 1->2->3
    public void removeDuplicates(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next!=null){
           if(temp.val==temp.next.val) {
            temp.next=temp.next.next;
           }else{
            temp=temp.next;
           }
        }
    }


    //QUESTION -2
    //merge two sorted ll into a sorted single ll
    // input : 1->2->3->4     5->7
    //output : 1->2->3->4->5->7

    public void mergeLL(){
        
    }

    public static void main(String[] args) {
        questions list=new questions();
        list.addInBeginning(3);
        list.addInBeginning(3);
        list.addInBeginning(3);
        list.addInBeginning(2);
        list.addInBeginning(2);
        list.addInBeginning(1);
        list.addInBeginning(1);
        list.addInBeginning(1);
        list.removeDuplicates();
        Node temp=list.head;
        while(temp.next!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.val);

    }

}
