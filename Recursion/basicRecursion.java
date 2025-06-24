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

    static void sum(int n ,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        else{
            sum+=n;
            sum(n-1,sum);

        }
    }

    static void factorial(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        
        factorial(n-1, fact*n);
    }

   static void array(int[] arr, int l, int r) {
    // Base case
    if (l >= r) {
        return;
    }
    // Swap the elements at l and r
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    // Recurse inward
    array(arr, l + 1, r - 1);
}

    public static void main(String[] args) {
        int n=5;
        int i=1;
        int sum1 =0;
        int fact=1;
        int l=0;
        int[] arr={1,2,3,4};
        int r=arr.length-1;
        // printNum(n);
        // number(n,i);
        // reverse(n);
        // sum(n, sum1);
        // factorial(n, fact);
        array(arr,l,r);
        for(int p: arr){
            System.out.println(p);
        }
        

    }
}