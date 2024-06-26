package Q006_NextGreaterElement_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nexMax[] = new int[nums2.length];
        loop1:
        for(int i = 0; i < nums2.length; i++) {
        	for(int j = i+1; j < nums2.length; j++) {
        		if(nums2[i] < nums2[j]) {
        			nexMax[i] = nums2[j];
        			continue loop1;
        		}
        	}
        	nexMax[i] = -1;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
        	map.put(nums2[i], nexMax[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
        	ans[i] = map.get(nums1[i]);
        }
        return ans;
        
    }
	public static void main(String[] args) {
		int[] arr1 = {4,1,2}, arr2 = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));//[-1, 3, -1]
		
		arr1 = new int[] {2,4};
		arr2 = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));// [3, -1]

	}

}
