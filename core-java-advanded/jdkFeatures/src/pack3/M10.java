package pack3;

interface F{
	int test();
}
public class M10 {
	static int m1() {
		System.out.println("m1");
		return 100;
	}
	static double m2() {
		System.out.println("m2");
		return 4.5;
	}
	static byte m3() {
		System.out.println("m3");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = M10::m1;
//		F f2 = M10::m2;//CTE (return type should be same or should be smaller range then interface method)
		F f3 = M10::m3;
		System.out.println(f1.test());
		System.out.println(f3.test());
	}

}
/*



*/