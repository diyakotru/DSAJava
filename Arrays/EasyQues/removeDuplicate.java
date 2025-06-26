import java .util.*;
public class removeDuplicate {
    public static void main(String[] args) {
//  Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
        int[] arr={1,1,1,1,2,2,3,3,3,3,3,4,5,6,7,7,7,7,8,9,9};
        int n=arr.length;
        //brute force 
        // HashSet<Integer>set=new LinkedHashSet<>();
        // for(int i:arr){
        //     set.add(i);
        // }
        // int index=0;
        // for(int j:set){
        //     arr[index++]=j;
        // }

        //optimal - 2pointer
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        for(int p: arr){
            System.out.print(p+" ");
        }
    }
}
