package DSAJava.BinarySearch;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,3,4,5,5,6,7};
        int n=arr.length;
        //find the first occurence of target value;
        int ans =0;
        int l=0;
        int r=arr.length-1;
        int target=2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
                r=mid-1;
            }else if (arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.println(ans);
    }
}
