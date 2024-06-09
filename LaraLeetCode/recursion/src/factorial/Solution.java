package factorial;

public class Solution {
	public int factorial(int n) {
		if(n <= 2) return n;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.factorial(5));
	}
}
