package pack3;

interface C{
	void test1(int i, String j);
}
public class M7 {
	static void m1(int x, String y) {
		System.out.println("from m1: " + x + ", " + y);
	}
	void m2(int p, String q) {
		System.out.println("from m1: " + p + ", " + q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = M7::m1;
		C c2 = new M7()::m2;
		c1.test1(100, "abc");
		c2.test1(200, "xyz");
	}

}
