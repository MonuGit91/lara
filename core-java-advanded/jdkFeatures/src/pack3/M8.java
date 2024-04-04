package pack3;

interface D{
	void test1(double i);
}
public class M8 {
	static void m1(int i) {
		System.out.println("from m1: " + i);
	}
	public static void main(String[] args) {
//		D d1 = M8::m1;
//		d1.test1(123.907);

	}

}
/*
 
CTE 
because narowing form double to int can not done automatically

*/