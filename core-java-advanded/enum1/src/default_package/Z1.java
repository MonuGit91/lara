package default_package;

public class Z1 {
	enum C{
		T1, T2, T3, T4, T5;//enum constant will act as object
		
		void test() {
			System.out.println("from test");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = C.T3;
		c1.test();
		System.out.println("==============");
		C c2 = C.T4;
		c2.test();
		System.out.println("==============");
	}

}
