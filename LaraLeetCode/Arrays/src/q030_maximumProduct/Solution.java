package q030_maximumProduct;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {2,3,-2,4};
		System.out.println(sol.maxProduct(arr));
		
		arr = new int[] {-2,0,-1};
		System.out.println(sol.maxProduct(arr));
	}
	public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        long prefixProduct = 1;
        long suffixProduct = 1;

        for(int i = 0; i < n; i++) {
            prefixProduct = prefixProduct == 0 ? 1 : prefixProduct;
            suffixProduct = suffixProduct == 0 ? 1 : suffixProduct;
            prefixProduct = (prefixProduct * nums[i])%Integer.MAX_VALUE;
            suffixProduct = (suffixProduct * nums[n-i-1])%Integer.MAX_VALUE;
            max = (int)Math.max(max, Math.max(prefixProduct, suffixProduct));
        }
        return max;
    }
}
