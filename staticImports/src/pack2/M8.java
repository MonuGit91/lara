package pack2;


//now using * we are importing every static member form the perticular calss, interface, enum
import static pack1.A.*;
import static pack1.A.test1;
import static pack1.B.*;
import static pack1.C.*;

import pack1.A;

public class M8 {
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(CON1);
		System.out.println(CON2);
		System.out.println(CON3);
		test1();
		A a1 = new A();//CTE
	}
}
