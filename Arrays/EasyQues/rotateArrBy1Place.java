public class rotateArrBy1Place {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,7,8,9};
        int temp=arr[0];
        // rotate arr by one place to left 
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i: arr){
            System.out.print(i+"  ");
        }
        
    }
}
