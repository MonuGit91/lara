package default_package;

public class Z3 {
	enum E{
		t1, t2, t3, t4;
		void method1() {
			System.out.println(this);
			System.out.println("method1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e1 = E.t1;
		System.out.println(e1);
		e1.method1();
		E e2 = E.t2;
		System.out.println(e2);
		e2.method1();
	}

}
