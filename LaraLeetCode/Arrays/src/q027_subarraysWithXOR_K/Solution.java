package q027_subarraysWithXOR_K;

public class Solution {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 2};
		int b = 2;
		System.out.println(subarraysWithSumK(a, b));
		
		a = new int[]{1, 3, 3, 3, 5};
		b = 6;
		System.out.println(subarraysWithSumK(a, b));
	}

	public static int subarraysWithSumK(int[] a, int b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int xor = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (xor == b)
					count++;
				xor ^= a[j];
			}
			if (xor == b)
				count++;
		}
		return count;
	}

}
