package DSAJava.SortingAlgos;

public class basicSortingAlgos {
    //Bubble Sort
    //Main idea : issme hum adjacent elements check krte hai n right side bhej dete hai
    static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //hum n-i-1 tk issliye chalate hai bcz i elements already sort ho jate hai right side se toh 
            //complete check karne ka koi faida nhi
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i: arr){
            System.out.println(i);
        }
    }

    
    //Selection Sort 
    //Major idea : hum min element select krte hai arr se ussko 1st place pr rkhte hai 
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for(int i: arr){
            System.out.println(i);
        }
    }

    //Insertion Sort  hum 1 se hr element select karenge n then compare karenege to all left elements n then shift krte te rhenge
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i: arr){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        int[]arr={1,22,1,2,222,12,345,56,45,68,909};
        // BubbleSort(arr);
        // SelectionSort(arr);
        insertionSort(arr);
      
        
    }
}
