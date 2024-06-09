package q029_reversePairs;

import java.util.*;

class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {1,3,2,3,1};
		System.out.println(sol.mergeSort(arr, 0, arr.length-1));
		
		arr = new int[] {2,4,3,5,1};
		System.out.println(sol.mergeSort(arr, 0, arr.length-1));
	}
	public int reversePairs(int[] nums) {
		int n = nums.length;
		int ans = mergeSort(nums, 0, n - 1);
		return ans;
	}

	int mergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return 0;
		}
		int mid = low + (high - low) / 2;
		int pairs = 0;
		pairs += mergeSort(arr, low, mid);
		pairs += mergeSort(arr, mid + 1, high);
		pairs += merge(arr, low, mid, high);
		return pairs;
	}

	int merge(int arr[], int low, int mid, int high) {
		int left = low, right = mid + 1;
		int pairs = getPairs(arr, low, mid, high);
		List<Integer> list = new ArrayList<>();
		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				list.add(arr[left++]);
			} else {
				list.add(arr[right++]);
			}
		}
		while (left <= mid) {
			list.add(arr[left++]);
		}
		while (right <= high) {
			list.add(arr[right++]);
		}
		int i = low;
		for(int val : list) {
			arr[i++] = val;
		}
		return pairs;
	}

	int getPairs(int arr[], int low, int mid, int high) {
		int right = mid + 1, pairs = 0;
		for (int left = low; left <= mid; left++) {
			while (right <= high && arr[left] > 2 * (double) arr[right]) {
				right++;
			}
			pairs += (right - (mid + 1));
		}
		return pairs;
	}
}