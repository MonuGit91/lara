package pack1;

public class I {
	public static void main(String[] args) {
		System.out.println(1);
		assert true : test(); // very simple assert statement     
		System.out.println(2);
	}
	static int test() {
		return 10;
	}
}
/*
after collon we can call any method which has return type other then void 
*/