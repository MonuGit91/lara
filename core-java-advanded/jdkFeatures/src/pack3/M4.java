package pack3;

public class M4 {
	void hello() {
		System.out.println("from hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new M4()::hello; // test1() of A interface is getting implemented by hello()
		a1.test1();
	}
}
/*
 * 
 * 
 */
