package pack1;

class F {
	void test(Integer arg, String arg2) {

	}
}

public class M6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F();
		F f2 = new F();
		F f3 = new F();
		f1.test(20, "abc");
		f1.test(45, "hello");
		f1.test(1000, "hi");
		System.out.println("done");
	}

}