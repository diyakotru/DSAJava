package DSAJava.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        //Brute force 
        // //left rotation 
        // int n=arr.length;
        // k=k%n;
        // for(int i=0;i<k;i++){
        //     int temp=arr[0];
        //     for(int j=0;j<n-1;j++){
        //         arr[j]=arr[j+1];
        //     }
        //     arr[n-1]=temp;
        // }
        // for(int i: arr){
        //     System.out.println(i);
        // }


        //Right rotation
        int n=arr.length;
        k=k%n;
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i: arr){
            System.out.println(i);
        }
        
        
    }
}
