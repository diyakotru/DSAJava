package DSAJava.Strings.EasyQuestions;

public class Palindrome {
    static boolean reverse(String s){
        StringBuilder ab=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            ab.append(s.charAt(i));
        }
        String reversed=ab.toString();
        if(reversed.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s ="madam";
        boolean flag=reverse(s);
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
