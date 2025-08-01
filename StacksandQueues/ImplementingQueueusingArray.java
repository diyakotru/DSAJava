package DSAJava.StacksandQueues;

public class ImplementingQueueusingArray {
    int start;
    int end ;
    int[]queue;
    int currentsize;
    int n;
    public ImplementingQueueusingArray(){
        start=-1;
        n=5;
        end=-1;
        queue=new int[n];
        currentsize=0;
    }
    void push(int x) {
        if (currentsize == n) {  
            System.out.println("Queue is full");
            return;
        }
        if (currentsize == 0) {
            start = end = 0;
        } else {
            end = (end + 1) % n;
        }
        queue[end] = x;
        currentsize++;
    }

    void peek(){
        if(currentsize==0){
            System.out.println("Empty");
        }else{
            System.out.println(queue[start]);
        }
    }

    void pop(){
        if(currentsize==0){
            return;
        }if(currentsize==1){
            start=end=-1;
            currentsize=0;
        }else{
            start=(start+1)%n;
            currentsize--;
        }
    }

    void size(){
        System.out.println("Size of queue:"+currentsize);        
    }

    public static void main(String[] args) {
        ImplementingQueueusingArray queue=new ImplementingQueueusingArray();
        queue.push(2);
        queue.push(7);
        queue.push(5);
        queue.pop();
        queue.peek();
        queue.size();
    }
}
