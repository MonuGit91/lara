package pack3;

class G{
	int i;
	G(int i){
		this.i = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		return (obj instanceof G) && (i == ((G)obj).i);
	}
}
public class M6 {
	public static void main(String[] args) {
		G g1 = new G(90);
		F f1 = new F(90);
		A a1 = new A();
		a1.i = 90;
		
		System.out.println(g1.equals(f1));
		System.out.println(g1.equals(a1));
		System.out.println(g1.equals(90));
		System.out.println(g1.equals(90.0));
	}
}

/*

here 90 and 90.0 is boxing into object class

where ever we are dowing downcasting in any ware then we should use instanceof operatio to avoid class cast exception

*/