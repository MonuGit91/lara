package default_package;
public class X {
	enum A{
		CON(100), TEST(200);//here ";" is mandatory
		A(int i){
			System.out.println("A(int): " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = A.TEST;
		System.out.println(a1);
	}

}
/*
- every constant is takeing an argument so constructor with argument is mandatory

*/