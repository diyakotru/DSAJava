package DSAJava.StacksandQueues.MedlvlPrbs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;


public class nextgreaterEleVariation {
    public int[] nextLargerElement(int[] arr) {
        int[] ans =new int[arr.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        return ans;
    }
    static int[] optimalapproach(int[] arr){
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>st.peek()){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        nextgreaterEleVariation obj=new nextgreaterEleVariation();
        int[] arr={1, 3, 2, 4};
        // int[] ans=obj.nextLargerElement(arr);
        int [] ans=optimalapproach(arr);
        for(int i:ans){
            System.out.println(i);
        }
    


        
    }
}
