package DSAJava.Recursion;

public class print1toN {
    static void printnum(int n){
        //From n to 1
    //    if(n<1){
    //     return;
    //    }
    //    System.out.println(n);
    //    printnum(n-1);

    // from 1 to n
    if(n==0){
        return;
    }
    printnum(n-1);
    System.out.println(n);   
    }
    public static void main(String[] args) {
        int n=5;
        printnum(n);
    }
}
