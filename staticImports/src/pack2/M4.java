package pack2;

//this type of import is called static import
import static pack1.A.i;
import static pack1.A.test1;
import static pack1.B.j;
import static pack1.B.k;
import static pack1.C.CON1;
import static pack1.C.CON2;
import static pack1.C.CON3;


public class M4 {
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(CON1);
		System.out.println(CON2);
		System.out.println(CON3);
		test1();
	}
}
