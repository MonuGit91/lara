package Q001_quickSelect_KthMax;

class Solution1 {
	public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int quickSellectAlgo(int[] arr, int left, int right, int k) {
        int pointer = left;
        for(int i = left; i < right; i++) {
            if(arr[i] > arr[right]) {
                swap(arr, i, pointer);
                pointer++;
            }
        }
        swap(arr, pointer, right);
        
		int rank = pointer-left+1;
		if(rank == k) return arr[pointer];
		else if(rank > k) {
            return quickSellectAlgo(arr, left, pointer-1, k);   
        }
	else {
			return quickSellectAlgo(arr, pointer+1, right, k-rank);
	}

    }
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSellectAlgo(nums, 0, n-1, k);
    }
}

