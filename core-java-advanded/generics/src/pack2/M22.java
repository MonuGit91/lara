package pack2;

class G<X> {
	X obj;
}
public class M22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G<?> g1 = null;//whild card character
		g1 = new G<Integer>();
		g1 = new G<Object>();
		g1 = new G<P>();
		g1 = new G<String>();
		g1 = new G<Thread>();
	}

}
/*
 * 
 * while card character means no boundry, we can use any data type
 * 
 * 
 * 
 */
