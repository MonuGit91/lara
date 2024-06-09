package Q005_nthFibonachii;

public class Solution1 {

	public static void main(String[] args) {
		Solutions sol = new Solutions();
		System.out.println(sol.fib(3));
		System.out.println(sol.fib(4));
		System.out.println(sol.fib(5));
	}
	
	public int fib(int n) {
		if(n <= 1) 
			return n;
				
		return fib(n-1)+fib(n-2);
		
	}

}
