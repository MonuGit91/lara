package Q005_threeSum;

import java.util.*;

public class Solution1 {
	Set<List<Integer>> set = new HashSet<>();
	
	public static void main(String[] args) {
		Solution obj = new Solution();
		int arr[] = {-1,0,1,2,-1,-4};
		System.out.println(obj.threeSum(arr));
	}
	
	public  List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			twoSum(arr, -arr[i], i+1, arr[i]);// a+b+c=t => a = t-(b+c)
		}
		ans.addAll(set);
		return ans;
	}
	
	public void twoSum(int arr[], int target, int from, int x) {
        Set<Integer> hs = new TreeSet<>();
        for(int i = from; i < arr.length; i++) {
        	int remaining = target-arr[i];
            if(hs.contains(remaining)) {
            	List<Integer> list = new ArrayList<Integer>();
                list.add(x);
                list.add(arr[i]);
                list.add(remaining);
                set.add(list);
            }
            hs.add(arr[i]);
        }
        
        
	}

}
