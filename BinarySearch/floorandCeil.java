package DSAJava.BinarySearch;

public class floorandCeil {
    public static void main(String[] args) {
        int[] arr={3, 4, 4, 7, 8, 10};
        int num=5;
        int floor=0;
        int ceil=0;
        //floor-largest no. that is smaller than or equal to x
        //ceil- lowest no. that is greater than or equal to x
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==num){
                ceil=num;
                floor=num;
                break;
            }else if (arr[mid]>num){
                ceil=arr[mid];
                r=mid-1;
            }else{
                floor=arr[mid];
                l=mid+1;
            }
        }
        System.out.println(floor +" "+ceil);

    }
}
