package DSAJava.Arrays.EasyQues;

import java.util.HashMap;

public class longestSubbArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=6;
        int max=0;
        //Brute force approach 
        //Time Complexity : O(N^2)
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             max=Math.max(max,j-i+1);
        //         }
        //     }
        // }
        // System.out.println("Max length"+max);

        //Optimal Approach ( Using HashMap +Prefix Sum)
        int len=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                max=Math.max(i+1,max);
            }
            if (map.containsKey(sum-k)){
                max=Math.max(max,i-(map.get(sum-k)));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i );

            }


        }
        System.out.println(max);

    }
}
