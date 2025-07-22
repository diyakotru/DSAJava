package DSAJava.Strings;

public class largestOddNumberInString {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char last = num.charAt(i);
            if ((last - '0') % 2 == 1) {  // check if digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";  // no odd digit found
    }
    public static void main(String[] args) {
        String s="8976543";
        String res=largestOddNumber(s);
        System.out.println(res);
    }
}
