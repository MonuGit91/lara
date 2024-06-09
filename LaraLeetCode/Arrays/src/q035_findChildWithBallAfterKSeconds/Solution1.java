package q035_findChildWithBallAfterKSeconds;

public class Solution1 {

	static class Solution { // if this class is private then use getter to get the object of Solution obj
		public int numberOfChild(int n, int k) {
			int direction = k / (n - 1);
			k = k % (n - 1);
			if (direction % 2 == 0) {
				return k;
			} else {
				return (n - 1) - k;
			}
		}
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.numberOfChild(3, 5));
	}
}
