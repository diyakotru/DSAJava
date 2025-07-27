package DSAJava.SortingAlgos;

public class quickSort {
    static int partition(int[] arr, int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;
        return i;
    }
    static void quicksort(int[] arr,int l,int h){
        if(l<h){
            int pind=partition(arr,l,h);//pivot ind
            quicksort(arr, l, pind-1);
            quicksort(arr, pind+1, h);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,31,3,21,34,657,9766,13,89,28};
        quicksort(arr, 0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
