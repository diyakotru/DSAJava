package DSAJava.BasicMaths;

public class armstrongNumber {
    public static void main(String[] args) {
        // Armstrong number : 153 - 1**3+5**3+3**3==number 
        int num=1553;
        int og=num;
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=d*d*d;
            num/=10;
        }
        if(sum==og){
            System.out.println("Armstrong ");
        }
        else{
            System.out.println("Not an Armstrong");
        }
   }
}
