package q028_countInversions;

public class Solution1 {

	public static void main(String[] args) {
		long arr[] = {2, 4, 1, 3, 5};
		System.out.println(inversionCount(arr, arr.length));
		
		arr = new long[]{2, 3, 4, 5, 6};
		System.out.println(inversionCount(arr, arr.length));
	}
	
	static long inversionCount(long arr[], long N)
    {
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                if(arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

}
