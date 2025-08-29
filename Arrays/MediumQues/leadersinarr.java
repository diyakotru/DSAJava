package DSAJava.Arrays.MediumQues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class leadersinarr {
    public static void leaders(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            boolean leader=true;
            for(int j=i+1;j<nums.length;j++){
                if(key<nums[j]){
                    leader=false;
                    break;
                }

            }
            if(leader){
                list.add(key);
            }
        }
        System.out.println(list);
    }

    public static void optimal(int[] arr){
        ArrayList<Integer>list=new ArrayList<>();
        int maxfromright=arr[arr.length-1];
        list.add(maxfromright);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=maxfromright){
                maxfromright=arr[i];
                list.add(maxfromright);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int [] arr={-3, 4, 5, 1, -4, -5};
        leaders(arr);
        optimal(arr);
    

    }

}
