package DSAJava.Strings;

public class reverseStr {
    public static void main(String[] args) {
        String name="Diya";
        // //Method 1
        // String reverse="";
        // for(int i=0;i<name.length();i++){
        //     reverse=name.charAt(i)+reverse;
        // }
        // System.out.println(reverse);

        //method 2 
        int n=name.length();
        // StringBuilder sb=new StringBuilder(name);
        // for(int i=0;i<n;i++){
        //     char first=name.charAt(i);
        //     char last=name.charAt(n-1-i);
        //     sb.setCharAt(i, last);
        //     sb.setCharAt(n-i-1, first);
        // }
        // System.out.println(sb.toString());

        //method-3
        char[] arr=name.toCharArray();
        int m=arr.length;
        for(int i=0;i<m/2;i++){
            char temp=arr[i];
            arr[i]=arr[m-i-1];
            arr[m-i-1]=temp;
        }
        for(char ab:arr){
            System.out.println(ab);
        }
    }
}
