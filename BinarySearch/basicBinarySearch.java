package DSAJava.BinarySearch;

public class basicBinarySearch {
    public static void main(String[] args) {
        //Binary search ek seraching alsgo hoti hai 
        // Linear search ek aur searching algo hoti hai 
        // binary search -> special cuz o(logn) TC hai , humesha sorted arr pe lgtii hai

        //Implementation
        int[] arr={2,3,4,5,6,7,8,9,13,144};
        int target=9;
        //find pos of target
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }else if (arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        //tc analysis 
        // every iteration half of the arr traverse kr rhe n/2 so tc o(logn) hai

    }
}
