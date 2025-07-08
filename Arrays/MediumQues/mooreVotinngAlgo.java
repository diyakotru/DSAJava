package MediumQues;

public class mooreVotinngAlgo {
    public static void main(String[] args) {
    //given an array print majority element
    //majority element>n/2 
    int[] arr={1,2,3,3,3,3,3,3,3,3};
    int ans=arr[0];
    //Brute force 
    // for(int i=0;i<arr.length;i++){
    //     int cnt=0;
    //     for(int j=0;j<arr.length;j++){
    //         if(arr[i]==arr[j]){
    //             cnt++;
    //         }
    //     }
    //     if(cnt>(arr.length/2)){
    //         ans=arr[i];
    //     }
    // }
    // System.out.println(ans);
    // }

    //optimal approach 
    //Moore Voting algo 
    int cnt=0;
    int cand=0;
    for(int i:arr){
        if(cnt==0){
            cand=i;
        }
        cnt+=(i==cand)?1:-1;
    }
    System.out.println(cand);
    }
}
