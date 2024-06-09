package Q002_naturalSum;

public class Solution {
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		System.err.println(sum(50));
		System.out.println(50*(50+1)/2);
	}
}

