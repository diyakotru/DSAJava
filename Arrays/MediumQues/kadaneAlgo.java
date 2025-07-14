package MediumQues;

import java.util.HashMap;

public class kadaneAlgo {
    public static void main(String[] args) {
        // Given an integer array arr, find the contiguous subarray (containing at least one number) which
        // has the largest sum and returns its sum and prints the subarray.
        // Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
        // Output: 6 
        // Explanation: [4,-1,2,1] has the largest sum = 6. 

        //Brute force approach :  O(n**2)
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4} ;
        // int maxSum=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i+1;j<arr.length;j++){
        //         sum+=arr[j];
        //         maxSum=Math.max(sum,maxSum);
        //     }
        // }
        // System.out.println(maxSum);

        //Optimal Approach O(n)
        int sum = arr[0];
        int maxsum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);  // extend or start new
            maxsum = Math.max(maxsum, sum);        // update max seen so far
        }

       System.out.println(maxsum);

    }
}
