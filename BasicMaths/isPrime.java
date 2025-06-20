package DSAJava.BasicMaths;
import java.util.*;


public class isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number that you wish to check");
        int num=sc.nextInt();
        int flag=0;
        if(num==2){
            flag=0;
        }
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
       
        
    }
}
