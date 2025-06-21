package DSAJava.BasicMaths;

public class gcdNlcm {
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=20;
        int b=28;
        //gcd : greatest common divisor 
        //brute force 
        // int gcd=1;
        // if(a==0){
        //     gcd=b;
        // }
        // else if(b==0){
        //     gcd=a;
        // }
        // else{
        //  for(int i=2;i<Math.min(a,b);i++){
        //     if(a%i==0&&b%i==0){
        //         gcd=i;
        //     }
        //  }

        // }
        // System.out.println("Gcd is :"+ gcd);

        //optimal Approach : Euclid Algo 
        // gcd(a,b)=gcd(a%b,b) if(a>b)
        // gcd(a,b)=gcd(a,b%a) if(b>a)
        //without recursion
        // while(a!=0&&b!=0){
        //     if(a<b){
        //         b=b%a;
        //     }
        //     else{
        //         a=a%b;
        //     }
        // }
        // if(a==0){
        //     System.out.println(b);
        // }
        // else{
        //     System.out.println(a);
        // }

        //with recursion 
        int res=gcd(a,b);
        System.out.println(res);
        //LCM : Num1 * Num 2 /GCD
        int lcm=a*b/res;
        System.out.println(lcm);

    }
}
