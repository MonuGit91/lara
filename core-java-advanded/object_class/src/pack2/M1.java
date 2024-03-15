package pack2;

class A {
	int i;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "its a type of object with i value " +i;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
		String s1 = "desc: " + a1;
		System.out.println(s1);
	}
	
}
