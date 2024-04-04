package pack1;

interface A{
	public static void test() {
		System.out.println("from test");
	}
}
public class M6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("----------");
	}

}
