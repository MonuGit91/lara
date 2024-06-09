package Q002_naturalSum;

public class Solution2 {
	public static int sum(int n) {
		if(n == 50) {
			return n;
		}
		
		return n + sum(n+1);
	}
	public static void main(String[] args) {
		System.out.println(sum(1));
	}

}
