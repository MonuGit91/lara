package Q002_maximumTastinessOfCandyBasket;

import java.util.Arrays;

class Solution {
    private static boolean isValid(int[] arr, int min, int k){
        int left = 0, count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[left] >= min) {
                left = i;
                count++;
                if(count >= k) return true;
            } 
        }
        return false;
    }
    public static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int lowAnsRange = 0, highAnsRange = price[n-1]-price[0];
        int maxOfMin = 0;
        while(lowAnsRange <= highAnsRange) {
            int mid = lowAnsRange+(highAnsRange-lowAnsRange)/2;
            if(isValid(price, mid, k)) {
                maxOfMin = mid;
                lowAnsRange = mid+1;
            }
            else highAnsRange = mid-1;
        }
        return maxOfMin;
    }
    
    public static void main(String[] args) {
		int arr[] = {13,5,1,8,21,2}, k = 3;
		System.out.println(maximumTastiness(arr, k));//8
		
		arr = new int[] {1,3,1};
		k = 2;
		System.out.println(maximumTastiness(arr, k));//2
		
		arr = new int[] {7,7,7,7};
		k = 2;
		System.out.println(maximumTastiness(arr, k));//0
	}
}