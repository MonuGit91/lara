package pack1;
import pack1.pack11.M;
import pack2.N;
import pack2.pack22.O;

public class L {
	public static void main(String[] args) {
		System.out.println(1);
		assert false;
		//pack1 and it's sub package
		System.out.println(2);
		pack1.pack11.M.test2();
		System.out.println(3);
		
		//pack2 and it's sub package
		pack2.pack22.O.test4();
		System.out.println(4);
		pack2.N.test3();
		System.out.println(5);
	}
}
/*
 * -ea
 * 	means enabels assert statement in all execution
 * 
 * -ea:pack2...
 *  means enabels assert statement in pack2 and it's sub packege
 *  
 *  -ea:pack2.N
 *  	means enabels assert statement in pack2.N
 * 
 *  -ea:pack1...
 *  	 means enabels assert statement in pack1 and it's sub packege
 *
 *
 *
 *	-ea -da:pack1... -da:pack2.pack22.O
 *	 means enables any ware and disable in pack1 and sup package  of pack1 and also diasable in O class
 *
 *
 *
 *
 */
