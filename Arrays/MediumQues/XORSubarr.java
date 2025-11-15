import java.util.HashMap;

public class XORSubarr {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4} ;
        int k = 6;
        int cnt=0;

        // for(int i=0;i<A.length;i++){
        //     int xor=0;
        //     for(int j=i;j<A.length;j++){
        //         xor=xor^A[j];
        //         if(xor==k){
        //             cnt+=1;
        //         }
        //     }
        // }


        //optimised approach 

        int prefix=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i :A){
            prefix^=i;

            if(map.containsKey(prefix^k)){
                cnt+=map.get(prefix^k);
            }
            map.put(i, map.getOrDefault(i, 0)+1);

        }


        System.out.println(cnt);
    }
}
