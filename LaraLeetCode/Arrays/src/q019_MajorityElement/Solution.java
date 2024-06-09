package q019_MajorityElement;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {3,2,3};
		System.out.println(sol.majorityElement(arr));
	
		arr = new int[] {2,2,1,1,1,2,2};
		System.out.println(sol.majorityElement(arr));
	}

	public int majorityElement(int[] nums) {
		int val = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (val == nums[i])
				count++;
			else
				count--;

			if (count < 1) {
				val = nums[i];
				count = 1;
			}
		}
		return val;
	}
}
