package pack3;

interface B{
	void test1(int i);
}
public class M6 {
	static void m1(int i) {
		System.out.println("i am from m1: " + i);
	}
	
	void m2(int i) {
		System.out.println("i am from m2: " + i);
	}
	
	public static void main(String[] args) {
		B b1 = M6::m1;//assigining m1() reference through class name
		b1.test1(100);
		
		M6 obj = new M6();
		B b2 = obj::m2;//assigining m2() reference through object reference
		b2.test1(200);
	}

}
