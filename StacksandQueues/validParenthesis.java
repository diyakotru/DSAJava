package DSAJava.StacksandQueues;
import java.util.*;

public class validParenthesis {
    public static void main(String[] args) {
        // return true is the paranthesis r valid 
        // Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        // An input string is valid if:

        // Open brackets must be closed by the same type of brackets.
        // Open brackets must be closed in the correct order.
        // Every close bracket has a corresponding open bracket of the same type.

        String s="[](){}";
        int n=s.length();
        if(n%2!=0){
            System.out.println("Not valid");
        }
        Stack<Character>stack=new Stack<>();
        for(char i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    System.out.println(false); 
                }
                char top =stack.peek();
                if(ch==']'&&top!='['){
                    System.out.println(false); 
                }
                if(ch==')'&&top!='('){
                     System.out.println(false); 
                }
                if(ch=='}'&&top!='{'){
                     System.out.println(false); }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
             System.out.println(true); 
        }
        System.out.println(false); 
 
    }
}
