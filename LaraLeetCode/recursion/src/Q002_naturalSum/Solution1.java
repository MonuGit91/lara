package Q002_naturalSum;

public class Solution1 {
	static int sum = 0;
	public static void sum(int n) {
		if(n > 50) 
			return;
		
		sum+=n;
		sum(n+1);
	}
	public static void main(String[] args) {
		sum(1);
		System.out.println(sum);
	}

}
