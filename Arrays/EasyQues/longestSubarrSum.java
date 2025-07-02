public  class longestSubarrSum{
    public static void main(String[] args) {
        // Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
        // Input Format: N = 3, k = 5, array[] = {2,3,5}
        // Result: 2

        // brute force approach
        int[] arr={2,3,5};
        int n=arr.length;
        int k=5;
        int maxlen=0;
        int len=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             len=j-i+1;
        //         }
        //         maxlen=Math.max(maxlen,len);
        //     }
        // }



        // optimal approach
        
        System.out.println(maxlen);
    }
}