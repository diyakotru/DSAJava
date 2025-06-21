package DSAJava.BasicMaths;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num=221;
        int og=num;
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        if(og==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
