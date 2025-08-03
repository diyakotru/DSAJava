package DSAJava.StacksandQueues.MedlvlPrbs;

import java.util.HashMap;
import java.util.Stack;

public class nextGreatestEle {
    public static void main(String[] args) {
        int[]nums1={4,1,2};
        int[] nums2 = {1, 3, 4, 2};
        int n1=nums1.length;
        int n2=nums2.length;
        int [] ans=new int[n1];
        //optimal approach (using monotonic stack(specific condition stack)+map)
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n2;i++){
            if(stack.isEmpty()){
                stack.push(nums2[i]);
            }else{
                while(!stack.isEmpty()&&nums2[i]>stack.peek()){
                    map.put(stack.peek(),nums2[i]);
                    stack.pop();
                    
                }
                stack.push(nums2[i]);
            }
        }
        while(!stack.isEmpty()){
            map.put(stack.peek(),-1);
            stack.pop();
        }
        for(int i=0;i<n1;i++){
            ans[i]=map.get(nums1[i]);
        }

    //     //Brute force 
    //     for(int i=0;i<n1;i++){
    //         int index=-1;
    //         for(int j=0;j<n2;j++){
    //             if(nums1[i]==nums2[j]){
    //                 index=j;
    //                 break;
    //             }
    //         }
    //         boolean found=false;
    //         for(int k=index+1;k<n2;k++){
    //             if(nums2[k]>nums2[index]){
    //                 ans[i]=nums2[k];
    //                 found=true;
    //                 break;
    //             }
    //         }
    //         if(!found){
    //             ans[i]=-1;
    //         }

    //     }
        for(int p:ans){
            System.out.println(p);
        }

    }
}
