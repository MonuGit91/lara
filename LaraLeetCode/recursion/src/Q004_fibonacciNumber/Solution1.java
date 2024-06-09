package Q004_fibonacciNumber;

public class Solution1 {
	public static void fibonacci(int first, int second, int n) {
		int third = first+second;
		if(third > n) 
			return;
		
		System.out.println(third);
		fibonacci(second, third, n);
	}
	public static void main(String[] args) {
		System.out.println(0+"\n"+1);
		fibonacci(0, 1, 5000);
	}

}
