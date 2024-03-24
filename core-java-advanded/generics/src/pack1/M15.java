package pack1;

interface O<X>{
	X test1();
	void test2(X x1);
	void test3(X x1, X x2);
}
class P implements O<String>{
	public String test1() {
		return null;
	}
	public void test2(String s1) {
		
	}
	public void test3(String s1, String s2) {
		
	}
}
class Q implements O<Integer>{
	public Integer test1() {
		return null;
	}
	public void test2(Integer s1) {
		
	}
	public void test3(Integer s1, Integer s2) {
	}
}

public class M15{
	public static void main(String[] args) {
		P p1 = new P();
		String s1 = p1.test1();
		p1.test2("abc");
		p1.test3("abc", "xyz");
		
		Q q1 = new Q();
		Integer s2 = q1.test1();
		q1.test2(12);
		q1.test3(10, 20);
		
		System.out.println("done");
	}
}