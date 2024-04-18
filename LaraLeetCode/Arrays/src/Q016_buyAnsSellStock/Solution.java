package Q016_buyAnsSellStock;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxPorfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] <  min){
                min = prices[i];
            }
            if(prices[i] - min > maxPorfit) {
                maxPorfit = prices[i] - min;
            }
        }
        return maxPorfit;
    }
}
