package DSAJava.POTD;

import java.util.*;
public class countsubsequenceSummingTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,53,22,43};
        int target=5;
        int mod=1_000_000_007;
        Arrays.sort(arr);
        int l=0;
        int n=arr.length;
        int r=n-1;
        int res=0;

        int[] pow2=new int[n];
        pow2[0]=1;
        for(int i=1;i<n;i++){
            pow2[i]=(pow2[i-1]*2)%mod;
        }

        while(l<=r){
            if(arr[l]+arr[r]>target){
                r--;
            }
            else{
                res=(res+pow2[r-l])%mod;
                l++;
            }
        }
        System.out.println("Number of subsequences is :"+ res);

    }
}
