package DSAJava.Strings;

public class basicStrings {
    public static void main(String[] args) {
        //Part-1 
        //Basics 
        String name="Diyaa";  //string ek class hai n diya ek object hai 
        // heap memory mei ek string concept pool hota hai joh bss unique values/objects ko store krta hai 
        // har variable ussko point karta hai 
        //Strings immutable hote hai 
        // strings can be deleted


        // Part-2
        // String Functions 
        System.out.println(name.toLowerCase());//yeh lower mei print kr dega pr permanent change nhi krega
        System.out.println(name.toUpperCase());//yeh upper case mei convert kr deta hai 
        System.out.println(name.charAt(2)); // output y
        System.out.println(name.indexOf('D')); // give index value
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.length());
        char ch[]=name.toCharArray(); // convert to char array 
        for(char i:ch){
            System.out.print(i+" ");
        }
        System.out.println();
        //compareTo function
        //agr length same to 0 agr s1 bda toh +ve varna -ve 
        // aur agr same length hogi to char by char ascii value check krega  aur output diff of their ascii value dega
        String name2="Jiya";
        System.out.println(name.compareTo(name2));

        //to trim space 
        System.out.println("            bdhjbesbcn".trim());
        System.out.println("Diya Kotru".startsWith(" Diya" )); // yeh false hai cuz usske phele space nhi hai pr abhi space mentioned hai
        System.out.println("Diya KOtru".endsWith("ru  "));// issme false hai cuz back mei space nhi hai pr issme diya hua hai

        //Substring -> continous + order maintained 
        //subseq->only order matters not continous 
        System.out.println("Diya".substring(0));//beginning with 0 index
        System.out.println("Diya".substring(2));//prints substring from index 2
        System.out.println("Siya".substring(0,2));//substr from 0 to 1 index last 2 is exclusive

        // fun ques
        String  email1="ahahsgwattiwari@google.com";
        String email2="modi@google.com";
        int a=email1.lastIndexOf("@");
        int b=email1.lastIndexOf(".");
        System.out.println(email1.substring(a+1, b));
        // String arr[]=email1.split("@");
        // String arr1[]=email2.split("@");
        // System.out.println(arr[1]);
        // System.out.println(arr1[1]);

        //Strings immutable hoti hai agr amit ka amita karna hai toh str kei case mei new bnega 
        //Mutable string -> stringBuffer(safe) ||String Builder (multithreading mei not safe)
        // toh mutable str same mei he changes kar deti hai \

        // Part-3 
        // concatenation +
        // string kei dono side + ho toh + ho jata hai n entire cheez str mei convert ho jati hai 
        System.out.println(9880+21+"Diya");// isme phele sum then diya add hota hai 
        System.out.println("Diya"+562+90);//issme left se phele diya562 fir 90 join hota hai 

        //string formating
        double num=1345678.9876543;
        System.out.println(num);
        System.out.printf("Number is %.2f ",num);
        String address="Delhi";
        String naam=String.format("Number is %f address is %s", num,address);
        System.out.println(naam);

        

        














        

    }
}
