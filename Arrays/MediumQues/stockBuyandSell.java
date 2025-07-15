package MediumQues;

public class stockBuyandSell {
    public static void main(String[] args) {
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        
    // Example 1:
    // Input: prices = [7,1,5,3,6,4]
    // Output: 5
    // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Brute force 
    int[] arr={7,6,4,3,1};
    // int diff=0;
    // int ans=0;
    // for(int i=0;i<arr.length;i++){
    //     int min=arr[i];
    //     for(int j=i+1;j<arr.length;j++){
    //         int max=arr[j];
    //         if(arr[j]>arr[i]){
    //             diff=arr[j]-arr[i];
    //             ans=Math.max(ans, diff);
    //         }
           
    //     }
    // }
    // System.out.println(ans);

    //optimal approach 
    int maxProfit=0;
    int minPrice=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        minPrice=Math.min(minPrice,arr[i]);
        maxProfit=Math.max(maxProfit,arr[i]-minPrice);
    }
    System.out.println(maxProfit);

    }
}
