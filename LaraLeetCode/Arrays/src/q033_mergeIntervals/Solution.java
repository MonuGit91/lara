package q033_mergeIntervals;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] ans = sol.merge(intervals);
		for(int[] arr : ans) System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		intervals = new int[][] {{1,4},{4,5}};
		ans = sol.merge(intervals);
		for(int[] arr : ans) System.out.println(Arrays.toString(arr));
	}
	public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr1[0]));
        int m = intervals.length, st = intervals[0][0], ed = intervals[0][1];
        for(int i = 1; i < m; i++) {
            if(ed >= intervals[i][0]) {
                ed = Math.max(ed, intervals[i][1]);
            } else {
                list.add(Arrays.asList(st, ed));
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }
        list.add(Arrays.asList(st, ed));
        int mat[][] = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            mat[i][0] = list.get(i).get(0);
            mat[i][1] = list.get(i).get(1);
        }
        return mat;
    }
}
