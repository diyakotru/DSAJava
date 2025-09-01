package DSAJava.SlidingWindow2Pointer;

import java.util.HashSet;
import java.util.Set;

public class basic {
    public static void main(String[] args) {
        //reverse an arr in place 
        // int[] arr={1,2,3,4,5};
        // int l=0;
        // int r=arr.length-1;
        // while(l<r){
        //     int temp=arr[l];
        //     arr[l]=arr[r];
        //     arr[r]=temp;
        //     l++;
        //     r--;
        // }
        // for(int i:arr){
        //     System.out.println(i+" ");
        // }

        //duplicates in arr
        // int[] arr={1,1,1,2,2,2,2,2,3,3,3,4,4,4,4};
        // int l=0;
        // int r=1;
        // while(r<=arr.length-1){
        //     if(arr[r]!=arr[l]){
        //         l++;
        //         arr[l]=arr[r];
                
        //     }
        //     r++;
        // }
        // for(int i:arr){
        //     System.out.println(i+" ");
        // }


        //Maximum sum subarray of size k
        //Input: nums = [2,1,5,1,3,2], k=3
        //Output: 9 (subarray [5,1,3]).
        // int sum=0;
        // int max=0;
        // int k=3;
        // int[] arr={2,1,5,1,3,2};
        // for(int i=0;i<k;i++){
        //     sum+=arr[i];
        // }
        // max=sum;
        // for(int j=k;j<arr.length;j++){
        //     sum+=arr[j]-arr[j-k];
        //     max=Math.max(max, sum);
        // }
        // System.out.println(max);


        //Longest substring without repeating characters
        //Input: "abcabcbb"
        //Output: 3 (longest substring = "abc").
        String s= "abcabcbb";
        int max=0;
        Set<Character>set=new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);

    }
}
