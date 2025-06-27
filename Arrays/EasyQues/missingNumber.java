public class missingNumber {
    public static void main(String[] args) {
        int n=10;
        int[] arr={1,2,4,5,6,7,8,9,10};
        int sum=0;
        int expsum=0;
        for(int i:arr){
            sum+=i;
        }
        for(int i=1;i<=n;i++){
            expsum+=i;
        }
        int a=expsum-sum;


        // optimal XOR APPROACH 
        // a^a=0      a^0=a
        System.out.println("The missing number is :"+a);
    }
}
