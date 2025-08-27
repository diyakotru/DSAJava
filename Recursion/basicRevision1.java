package DSAJava.Recursion;
public class basicRevision1 {
    static void name(int i,String name){
        if(i>5)return;
        System.out.println(name);
        name(i+1,name);
    }
    static void print1ton(int i,int n){
        if(i>n)return;
        System.out.println(i);
        print1ton(i+1, n);
    }
    static void printnto1(int n){
        if(n<=0)return;
        System.out.println(n);
        printnto1(n-1);
    }
    public static void main(String[] args) {
        //print name 5 times 
        int i=1;
        int n=5;
        // name(i,"Diya");
        //print from 1 to n 
        // print1ton(i,n);
        //print from n to one
        // printnto1(n); 

    }
}
