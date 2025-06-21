package DSAJava.BasicMaths;
import java.util.*;


public class isPrime {
    public static void main(String[] args) {
        //Brute force approach
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Number that you wish to check");
        // int num=sc.nextInt();
        // int flag=0;
        // if(num==2){
        //     flag=0;
        // }
        // for(int i=2;i*i<num;i++){
        //     if(num%i==0){
        //         flag=1;
        //         break;
        //     }
        // }
        // if(flag==1){
        //     System.out.println("Not Prime");
        // }
        // else{
        //     System.out.println("Prime");
        // }



        //optimal approach ->Sieve of Eratosthenes
        int n=50;
        //Step->1 make all values prime
        boolean [] resultArr=new boolean[51];
        for(int i=2;i<51;i++){
            resultArr[i]=true;
        }
        //Step 2-> for each prime element make its multiples false;
        for(int j=2;j<51;j++){
            if(resultArr[j]){
                for(int p=j*2;p<51;p+=j){
                    resultArr[p]=false;
                }
            }
        }
        System.out.println("Primes up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (resultArr[i]) {
                System.out.print(i + " ");
            }
        }


        // time complexity analysis : normal : o(n)
        // optimal takes o(nlog(log(n))) cuz 1/p=log(log(n))
       
        
    }
}
