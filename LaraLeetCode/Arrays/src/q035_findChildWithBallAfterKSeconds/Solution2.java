package q035_findChildWithBallAfterKSeconds;

public class Solution2 {

	static class Solution {
	    public int numberOfChild(int n, int k) {
	        boolean leftToRight = true, rightToLeft = false;
	        int l = 0, r = n-1;
	        for (int i = 0; i < k; i++) {
	            if (leftToRight && l == n - 1) {
	                leftToRight = false;
	                rightToLeft = true;
	                r = n - 1;
	            } else if (rightToLeft && r == 0) {
	                rightToLeft = false;
	                leftToRight = true;
	                l = 0;
	            }
	            if (leftToRight) {
	                l++;
	            } else {
	                r--;
	            }
	        }
	        return leftToRight ? l : r;
	    }
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.numberOfChild(3, 5));
	}

}
