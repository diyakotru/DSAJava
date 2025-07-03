package DSAJava.Recursion;

public class Sum {
    static int sum(int N){
         if(N==0){
            return 0;
        }
        return N+sum(N-1);
    }
    public static void main(String[] args) {
        int n=5;
        int a=sum(n);
        System.out.println(a);
    }
}
