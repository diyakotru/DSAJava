package DSAJava.StacksandQueues;
import java.util.*;

public class bracketBalancing {
    public static void main(String[] args) {
        //Brute force
        String s = "}{{}}{{{";

        if (s.length() % 2 != 0) {
            System.out.println("The string can't be made valid");
            return;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                stack.push(ch);
            } else { // ch == '}'
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); // balanced pair
                } else {
                    stack.push(ch); // unmatched close
                }
            }
        }

        // Count remaining '{' and '}' in the stack
        int open = 0, close = 0;

        while (!stack.isEmpty()) {
            if (stack.pop() == '{') open++;
            else close++;
        }

        int reversals = (int)(Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        System.out.println("Minimum reversals needed: " + reversals);
    }
}


//optimised 
// public class bracketBalancing {
//     public static void main(String[] args) {
//         String s = "}{{}}{{{";

//         // Odd length can't be balanced
//         if (s.length() % 2 != 0) {
//             System.out.println("The string can't be made valid");
//             return;
//         }

//         int open = 0, close = 0;

//         for (char ch : s.toCharArray()) {
//             if (ch == '{') {
//                 open++;
//             } else { // ch == '}'
//                 if (open > 0) {
//                     open--; // found a pair
//                 } else {
//                     close++; // unmatched closing
//                 }
//             }
//         }

//         int reversals = (int)(Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
//         System.out.println("Minimum reversals needed: " + reversals);
//     }
// }
