package DSAJava.StacksandQueues;

public class ImplementingStacksusingLL {
    // Creating a node 
   static class Node{
    int val;
    Node next;
    public Node (int val){
        this.val=val;
        this.next=null;
    }
   }
   Node top;
   void push(int val){
        Node newnode=new Node(val);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
   }

   void pop(){
    Node temp=top;
    top=top.next;
   }
   void peek(){
    if(top==null){
        System.out.println("Stack is empty");
        return;
    }
    System.out.println(top.val);

   }
   void size(){
    int count=0;
    if(top==null){
        return;
    }
    Node temp=top;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    System.out.println("Size of stack: " + count);
    }
    
    public static void main(String[] args) {
        ImplementingStacksusingLL stack = new ImplementingStacksusingLL();
        stack.push(6);
        stack.push(7);
        stack.push(78);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.size();
    }
}
