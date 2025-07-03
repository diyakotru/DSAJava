package DSAJava.POTD;

import javax.annotation.processing.Generated;

public class kthString {
// Example 1:

// Input: k = 5

// Output: "b"

// Explanation:

// Initially, word = "a". We need to do the operation three times:

// Generated string is "b", word becomes "ab".
// Generated string is "bc", word becomes "abbc".
// Generated string is "bccd", word becomes "abbcbccd".
public static void main(String[] args) {
    int k=5;
    int len=1;
    //Doubling the len 
    while(len<k){
        len*=2;
    }

    //reverse
    int shift=0;
    while(len>1){
        len/=2;
        if(len<k){
            k-=len;
            shift++;
        }
    }
    System.out.println((char)('a'+(shift%26)));

    
}


}
