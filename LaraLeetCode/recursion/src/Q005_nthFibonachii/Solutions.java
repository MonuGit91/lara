package Q005_nthFibonachii;

public class Solutions {
	
	public static void main(String[] args) {
		Solutions sol = new Solutions();
		System.out.println(sol.fib(3));
		System.out.println(sol.fib(4));
		System.out.println(sol.fib(5));
	}
	
	int arr[] = new int[31];//if maximum value of n goes up to 30
	public int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(arr[n] != 0) {
			return arr[n];
		}
		
		return arr[n] =  fib(n-1)+fib(n-2);
		
	}

}
