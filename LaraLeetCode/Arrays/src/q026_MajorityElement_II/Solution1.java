package q026_MajorityElement_II;

import java.util.*;
import java.util.stream.*;
public class Solution1 {

	public static void main(String ...args) {
		Solution1 sol = new Solution1();
		int arr[] = {3,2,3};
		System.out.println(sol.majorityElement(arr));
		
		arr = new int[]{1,2};
		System.out.println(sol.majorityElement(arr));
	}
	
	public List<Integer> majorityElement(int[] nums) {
		int val1 = Integer.MIN_VALUE, val2 = Integer.MIN_VALUE, count1 = 0, count2 = 0, n = nums.length;
		List<Integer> list = new ArrayList<>();
		
		for(int val : nums) {
            if(count1 == 0 && val != val2) {// && val != val2 ****
                count1 = 1;
                val1 = val;
            } else if(count2 == 0 && val != val1) { // && val != val1 ***
                count2 = 1;
                val2 = val;
            } else if(val == val1) 
                count1++;
            else if(val == val2) 
                count2++;
            else {
                count1--;
                count2--;
            }
        }
        
        int ele1 = val1, ele2 = val2;
        count1 = (int)Arrays.stream(nums).filter(e -> e == ele1).count();
        count2 = (int)Arrays.stream(nums).filter(e -> e == ele2).count();
        if(count1 > n/3) list.add(val1);
        if(count2 > n/3) list.add(val2);
		return list;
    }
}
