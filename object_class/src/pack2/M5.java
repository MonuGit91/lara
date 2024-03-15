package pack2;

class G{
	int i;
}
public class M5 {
	public static void main(String[] args) {
		G g1 = new G();
		g1.i = 10;
		
		G g2 = new G();
		g2.i = 10;
		
		System.out.println(g1 == g2);
		System.out.println(g1.equals(g2));
		
		G g3 = g1;
		System.out.println(g3 == g1);
		System.out.println(g3.equals(g1));
	}

}
/*
  == operator always check refrence
  here equals method by default checks refrence

*/