package bsOnAns.squareRootOfNumber;

class Solution {
	public static long floorSqrt(long x) {
		long low = 0, high = x, ans = -1;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (mid * mid < x) {
				low = mid + 1;
			} else if (mid * mid > x) {
				high = mid - 1;
			} else
				return mid;
		}
		return high;
	}
	
	public static void main(String[] args) {
		System.out.println(floorSqrt(5));//2
	}
}
