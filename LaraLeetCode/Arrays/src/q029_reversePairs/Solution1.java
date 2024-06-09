package q029_reversePairs;

public class Solution1 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = { 1, 3, 2, 3, 1 };
		System.out.println(sol.mergeSort(arr, 0, arr.length - 1));

		arr = new int[] { 2, 4, 3, 5, 1 };
		System.out.println(sol.mergeSort(arr, 0, arr.length - 1));
	}

	public int reversePairs(int[] nums) {
		int n = nums.length, pairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > 2 * (double) nums[j]) {
					pairs++;
				}
			}
		}
		return pairs;
	}
}
