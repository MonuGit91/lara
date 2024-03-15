package default_package;

public class Z4 {

	// TODO Auto-generated method stub
	enum F {
		t1, t2, t3 {//constant specific class body
			void method1() {
				System.out.println("inner");
			}
		},
		t4, t5;

		void method1() {
			System.out.println("General");
		}
	}

	public static void main(String[] args) {
		F f1 = F.t1;
		F f2 = F.t2;
		F f3 = F.t3;
		F f4 = F.t4;
		F f5 = F.t5;
		
		f1.method1();//General
		f2.method1();//General
		f3.method1();//inner
		f4.method1();//General
		f5.method1();//General

	}

}
