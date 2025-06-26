public class largestNumber {
    public static void main(String[] args) {
        // Given an array, we have to find the largest element in the array.
        // time comp: o(n) space comp : o(1)
        int [] arr={34,56,1,2,45,9,89};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Largest Number in the array is : "+max);
    }
}
