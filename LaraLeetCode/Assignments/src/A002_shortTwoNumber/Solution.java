package A002_shortTwoNumber;

public class Solution {
	public void shortTwoNumber(int ...arr) {
		int n = arr.length;
		int i = 0, j = n-1;
		int num1 = arr[0], num2 = arr[0];
		
		for(int k = 0; k < n; k++) {
			if(arr[k] != num1) {
				num1 = Math.min(num1, arr[k]);
				num2 = Math.max(num2, arr[k]);
				break;
			}
		}
		while(i < j) {
			if(arr[i] == num2) swap(arr, i, j--);
			else i++;
		}
	}
	private void swap(int arr[], int i, int j) {
		if(arr[i] == arr[j]) return;
		
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}