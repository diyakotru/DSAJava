package DSAJava.BasicMaths;

public class countNoOfDigit {
    public static void main(String[] args) {
        int n=675;
        int count=0;
        //onr line no. of digits 
        System.out.println((int)Math.log10(n)+1);
        
        while(n!=0){
            int d=n%10;
            System.out.print(d+"");
            count++;
            n/=10;
            
        }
        System.out.println();
        System.out.println(count);
    }
}
