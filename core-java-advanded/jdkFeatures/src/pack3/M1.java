package pack3;

public class M1 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void test1() {
				System.out.println("from test1");
			}
		};
		a1.test1();
	}
}