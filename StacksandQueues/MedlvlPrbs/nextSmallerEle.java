package DSAJava.StacksandQueues.MedlvlPrbs;

import java.util.Arrays;
import java.util.*;

public class nextSmallerEle {
    public static void main(String[] args) {
        int[]arr={4, 8, 5, 2, 25};
        int[] ans=new int[arr.length];
        Arrays.fill(ans,-1);
        //Brute force 
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[i]){
        //             ans[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        //optimal 
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }else{
                ans[i]=-1;
            }
            stack.push(arr[i]);
        }
        for(int k:ans){
            System.out.println(k);
        }
    }
}
