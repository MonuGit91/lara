package Q006_NextGreaterElement_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int nexMax[] = new int[nums2.length];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0; i < nums2.length; i++) {
            while(!stk.isEmpty() && nums2[stk.peek()] < nums2[i]) {
            	nexMax[stk.peek()] = nums2[i];
            	stk.pop();
            }
            stk.push(i);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
        	map.put(nums2[i], nexMax[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
        	ans[i] = map.get(nums1[i]);
            if(ans[i] == 0) ans[i] = -1;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr1 = {5, 3, 2, 4}, arr2 = {2, 3, 6, 4, 8, 5, 9};
		System.out.println(Arrays.toString(sol.nextGreaterElement(arr1, arr2)));//[-1, 3, -1]
		
		arr1 = new int[] {2,4};
		arr2 = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(sol.nextGreaterElement(arr1, arr2)));// [3, -1]
	}

}
