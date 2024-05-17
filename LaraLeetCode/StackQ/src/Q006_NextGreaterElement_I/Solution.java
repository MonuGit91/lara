package Q006_NextGreaterElement_I;

import java.util.*;
public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        Stack<Integer> stk = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = nums2.length-1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() < nums2[i]) {
                stk.pop();
            }
            if(stk.isEmpty()) map.put(nums2[i], -1);
            else map.put(nums2[i], stk.peek());
            stk.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr1 = {4,1,2}, arr2 = {1,3,4,2};
		System.out.println(Arrays.toString(sol.nextGreaterElement(arr1, arr2)));//[-1, 3, -1]
		
		arr1 = new int[] {2,4};
		arr2 = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(sol.nextGreaterElement(arr1, arr2)));// [3, -1]
	}

}
