package Q016_buyAnsSellStock;

public class Solution1 {
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPorfit = 0;

        for(int i = 0; i < prices.length; i++){
        	int todaysPrice = prices[i];
            if(todaysPrice <  minPrice){
            	minPrice = todaysPrice;
            	continue;
            }
            int todaysProfit = prices[i]-minPrice;
            if(todaysProfit > maxPorfit) {
                maxPorfit = todaysProfit;
            }
        }
        return maxPorfit;
    }

}
