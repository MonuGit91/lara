package pack4;

class C{
	int i;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.i = 10;
		C c2 = new C();
		c2.i = 10;
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
