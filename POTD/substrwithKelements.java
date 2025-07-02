
package DSAJava.POTD;
import java.util.*;

public class substrwithKelements {
     public static void main(String[] args) {
        // ques : you are given a str ussme substr bnane hai of len k having k-1 unique char
        //brute force 
        String s="aabccd";
        int k=3;
        int n=s.length();
        int count=0;
        // for(int i=0;i<=n-k;i++){
        //     String sub=s.substring(i,i+k);
        //     Set<Character>set=new HashSet<>();
        //     for(char c: sub.toCharArray()){
        //         set.add(c);
        //     }
        //     if(set.size()==k-1){
        //         count++;
        //     }

        // }

        //optimal approach using 2pointer n sliding window
        Map<Character,Integer>map=new HashMap<>();
        int distinct=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get( ch)==1){
                distinct++;
            }
            if (i >= k) {
                char toRemove = s.charAt(i - k);
                map.put(toRemove, map.get(toRemove) - 1);
                if (map.get(toRemove) == 0) {
                    distinct--;
                }
            }

            if(i>=k-1&&distinct==k-1){
                count++;
            }

        }

        System.out.println("Substring count"+count);
    }
}
