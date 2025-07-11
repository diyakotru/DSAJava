public class isSorted {
    public static void main(String[] args) {
        int[] arr={1,23,12,34,6775,321,12};
        int flag=0;
        //brute force -->  check whether for a particular element if rest of the elements are greater 
        // time comp : o(n2) sc 0(1)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    flag=1;
                }
            }
            
        }

        //optimal approach 
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            flag=1;
            break;
            }
        }

        if(flag==1){
            System.out.println("Not Sorted");

        }else{
            System.out.println("Sorted");
        }


        
    }
}
