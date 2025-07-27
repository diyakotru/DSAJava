package DSAJava.SortingAlgos;

public class mergeSort {
    static void conquer(int [] arr, int s, int m, int e){
        //new array
        int [] temp=new int[e-s+1];
        int index1=s;
        int index2=m+1;
        int x=0;
        while(index1<=m&&index2<=e){
            if(arr[index1]<=arr[index2]){
                temp[x++]=arr[index1++];
            }else{
                temp[x++]=arr[index2++];
            }
        }
        while(index1<=m){
            temp[x++]=arr[index1++];
        }
        while(index2<=e){
            temp[x++]=arr[index2++];
        }
       
        for(int i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }
    }
    static void divide(int[] arr, int s,int e){
        if(s >= e) return;
        int mid=s+(e-s)/2;
        divide(arr,0,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }
    public static void main(String[] args) {
        int [] arr={23,1,2,3,2,12,32,1,234,23499};
        int start=0;
        int end=arr.length-1;
        divide(arr,start,end);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
