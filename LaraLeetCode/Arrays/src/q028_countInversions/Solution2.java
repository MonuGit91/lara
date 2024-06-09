package q028_countInversions;

import java.util.*;
public class Solution2 {

	public static void main(String[] args) {
		long arr[] = {2, 4, 1, 3, 5};
		System.out.println(inversionCount(arr, arr.length));
		
		arr = new long[]{2, 3, 4, 5, 6};
		System.out.println(inversionCount(arr, arr.length));
	}
	static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0, (int)N-1);    
    }
    static long mergeSort(long arr[], int low, int high) {
        if(low >= high) {
            return 0;
        }
        int mid = low+(high-low)/2;
        long curPairs = 0;
        curPairs += mergeSort(arr, low, mid);
        curPairs += mergeSort(arr, mid+1, high);
        curPairs += merge(arr, low, mid, high);
        return curPairs;
    }
    static long merge(long arr[], int low, int mid, int high) {
        int left = low, right = mid+1;
        long pairs = countPairs(arr, low, mid, high);
        List<Long> list = new ArrayList<>();
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {// here '<=' is must
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
            }
        }
        while(left <= mid) {
            list.add(arr[left++]);
        }
        while(right <= high) {
            list.add(arr[right++]);
        }
        int i = 0;
        for(int j = low; j <= high; j++) {
            arr[j] = list.get(i++);
        }
        return pairs;
    }
    
    static long countPairs(long[] arr, int low, int mid, int high) {
        int left = low, right = mid+1;
        long pairs = 0;
        while(left <= mid && right <= high) {
            if(arr[left] > arr[right]) {
                pairs += (mid-left+1);
                right++;
            } else {
                left++;
            }
        }
        return pairs;
    }

}
