package Q007_arrayIntersection2__streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int arr1[] = {1,2,2,1};
		int arr2[] = {2, 2};
		
		int ans[] = intersection(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])  && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int arr[] = list.stream().mapToInt(e->e).toArray();
//        int arr[] = new int[list.size()];
//        for(int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
        return arr;
    }
}

