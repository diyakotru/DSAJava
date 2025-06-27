public class missingNumber {
    public static void main(String[] args) {
        int n=10;
        int[] arr={1,2,4,5,6,7,8,9,10};
        // int sum=0;
        // int expsum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // for(int i=1;i<=n;i++){
        //     expsum+=i;
        // }
        // int a=expsum-sum;


        // optimal XOR APPROACH 
        // a^a=0      a^0=a
        int xor1 = 0; // For 1 to n
        int xor2 = 0; // For array elements

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        int missing = xor1 ^ xor2;
        System.out.println("The missing number is: " + missing); 
    }
}
