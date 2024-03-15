package pack3;

class A{
	int i;
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.i = 10;
		
		A a2 = new A();
		a2.i = 10;
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.i == a2.i);
	}

}
