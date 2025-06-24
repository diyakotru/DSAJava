public class basicRecursion{
    static void printNum(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.println("*");
            printNum(n-1);
        }
    }

    static void number(int n,int i){
        if(i>n){
            return ;

        }else{
            System.out.println(i);
            number(n,i+1);
        }
    }

    static void reverse(int n){
        if(n<0){
            return;
        }
        else{
            System.out.println(n);
            reverse(n-1);
        }
    }

    static void sum 
    public static void main(String[] args) {
        int n=5;
        int i=1;
        // printNum(n);
        // number(n,i);
        reverse(n);
    }
}