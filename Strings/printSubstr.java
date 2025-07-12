package DSAJava.Strings;

public class printSubstr {
    public static void main(String[] args) {
        //"abc"
        //n(n+1)/2--->total no. of non empty substrings +1(" ")empty substr
        //a,b,c,ab,abc,bc
        //TC :O(N^2)
        String a="abc";
        int n=a.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(a.substring(i, j));
            }
        }
    }
}
