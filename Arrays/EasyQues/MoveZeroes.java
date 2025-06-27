import java.util.*;
public class MoveZeroes {
    public static void main(String[] args) {
        // Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
        // Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

        // brute force 
        // take an arrlist add all unique ele ->copy it to og arr
        int[] arr={0,1,2,3,0,0,3,0,4,30,0};
        // ArrayList<Integer>list=new ArrayList<>();
        // for(int i:arr){
        //     if(i!=0){
        //         list.add(i);
        //     }
        // }
        // int size=list.size();
        // for(int j=0;j<size;j++){
        //     arr[j]=list.get(j);

        // }
        // for(int k=size;k<arr.length;k++){
        //     arr[k]=0;
        // }

        
        //optimal approach 
        int index=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=0){
                arr[index++]=arr[k];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }

        System.out.println("Array is ");
        for(int num: arr){
            System.out.print(num+" ");
        }

       

    }
}
