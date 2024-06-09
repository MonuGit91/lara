package Q001_oneToFifty;

public class Solution {

	public static void test(int n) {
		if(n > 50) {
			return;
		}
		System.out.print(n + ",");
		test(n+1);
	}
	public static void main(String[] args) {
		test(1);
	}

}
