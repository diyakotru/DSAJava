package MediumQues;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        //given an arr 
        //2 numbers that sum up to the target value
        //Brute force O(N2)
        // int[] arr={1,2,11,32,3,21,1};
        // int target=3;
        // int[] ans =new int[2];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;

        //         }
        //     }
        // }


        //optimal approach tc o(n)  sc o(n)
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int need=target-arr[i];
        //     if(map.containsKey(need)){
        //         ans[0]=map.get(need);
        //         ans[1]=i;
        //     }
        //     map.put(arr[i],i);
        // }
        // for(int num:  ans){
        //     System.out.println(num);
        // }

        
    }

}
