package q024_leadersInAnArray;

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		int arr[] = {16,17,4,3,5,2};
		System.out.println(leaders(arr, arr.length));
		
		arr = new int[]{10,4,2,4,1};
		System.out.println(leaders(arr, arr.length));
	}

	public static ArrayList<Integer> leaders(int arr[], int n) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[n - 1]));
		int leftMax = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= leftMax) {
				list.add(arr[i]);
				leftMax = arr[i];
			}
		}
		int i = 0, j = list.size() - 1;
		while (i < j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
		return list;
	}

}
