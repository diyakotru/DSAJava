package DSAJava.Strings.EasyQuestions;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "education";
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' &&
                s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                sb.append(s.charAt(i));
            }
        }
        
        String ans = sb.toString();
        System.out.println(ans);  
    }
}
