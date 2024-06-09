package q017_checkIfArrayIsSortedAndRotated;

public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {3,4,5,1,2};
		System.out.println(sol.check(arr));
		
		arr = new int[]{2,1,3,4};
		System.out.println(sol.check(arr));
	}
	
	public boolean check(int[] nums) {
        int rotatingIdx = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                rotatingIdx = i;
                break;
            }
        }
        int pre = rotatingIdx;
        int idx = (rotatingIdx+1) % nums.length;
        
        while(idx != rotatingIdx) {
            if(nums[idx] < nums[pre])
                break;
            pre = idx;
            idx = (idx+1)%nums.length;
        }
        return rotatingIdx == idx;
    }
}
