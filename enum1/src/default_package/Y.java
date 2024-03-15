package default_package;

public class Y {
	enum A{
		CON1, CON2(900), CON3, CON4("ABC");
		A(){
			System.out.println("A()");
		}
		A(int i){
			System.out.println("A(int): " + i);
		}
		A(String s1){
			System.out.println("A(String): " + s1);
		}
		/*
		 * here constructor overloading is done
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = A.CON4;
		System.out.println("---------------");
		System.out.println(a1);
	}

}
