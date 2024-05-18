package Q008_nextGreaterElement_II;

import java.util.*;

public class Solution {
	public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < 2*nums.length; i++) {
        	while(!stk.isEmpty() && nums[i%n] > nums[stk.peek()]) {
        		ans[stk.peek()] = nums[i%n];
        		stk.pop();
        	}
        	stk.push(i%n);
        }
        return ans;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {1,2,1};
		System.out.println(Arrays.toString(sol.nextGreaterElements(arr)));//[2,-1,2]
		
		arr = new int[] {1,2,3,4,3};
		System.out.println(Arrays.toString(sol.nextGreaterElements(arr)));// [2,3,4,-1,4]
	}

}
