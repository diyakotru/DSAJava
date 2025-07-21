package DSAJava.StacksandQueues;

public class ImplementingStacksUsingArray {
    //class variables 
    int[] stack;
    int top;
    int n;
    //class kei variables ko constructor se initialize karte hai 
    public ImplementingStacksUsingArray(int x){
        stack=new int[x];
        top=-1;
        n=x;
    }

    void push(int num){
        if(top>=n-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top]=num;
    }

    boolean isEmpty(){
        if(top==-1){
            System.out.println("Underflow");
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top>=n-1){
            System.out.println("Overflow");
            return true;
        }
        return false;
    }

    void pop(){
        if(top==-1){
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        System.out.println("Deleted the value: " + stack[top]);
        top--;
    }

    void peek(){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    void printStack(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        for(int i=0;i<=top;i++){
           System.out.println(stack[i]);

        }
    }
    
    public static void main(String[] args) {
        int n=5;
        //Create object 
        ImplementingStacksUsingArray stack=new ImplementingStacksUsingArray(n);
        stack.push(78);
        stack.push(12);
        stack.push(67);
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        stack.peek();
        stack.printStack();

    }
}
