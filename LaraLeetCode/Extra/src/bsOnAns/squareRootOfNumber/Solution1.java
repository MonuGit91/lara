package bsOnAns.squareRootOfNumber;

public class Solution1 {

	private static long pow(long base, long exponent) {
		if (exponent == 0)
			return 1;
		/*
		if(n < 0) {
        	base = 1/base;
        	exponent *= -1;
        }
		 */
		long ans = pow(base, exponent / 2);
		if (exponent % 2 == 0)
			return ans * ans;
		else
			return base * ans * ans;
		
		/*
		long ans = 1;
		while(exponent > 0) {
			if(exponent % 2 == 1) 
				ans *= base;
			
			base *= base;
			exponent /= 2;
		}
		 */
	}

	public static long floorSqrt(long x) {
		long low = 0, high = x, ans = -1;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (pow(mid, 2) < x) {
				low = mid + 1;
			} else if (pow(mid, 2) > x) {
				high = mid - 1;
			} else
				return mid;
		}
		return high;
	}

	public static void main(String[] args) {
		System.out.println(floorSqrt(5));// 2
	}

}
