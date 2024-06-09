package Q004_fibonacciNumber;

public class Solution {
	public static void fibonacci(int n) {
		int first = 0, second = 1;
		System.out.println(first + "\n" + second);
		while(first <= n) {
			int third = first+second;
			first = second;
			second = third;
			System.out.println(third);
		}
	}
	public static void main(String[] args) {
		fibonacci(5000);
	}
}
