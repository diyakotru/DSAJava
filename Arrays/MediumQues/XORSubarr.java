public class XORSubarr {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4} ;
        int k = 6;
        int cnt=0;

        for(int i=0;i<A.length;i++){
            int xor=0;
            for(int j=i;j<A.length;j++){
                xor=xor^A[j];
                if(xor==k){
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}
