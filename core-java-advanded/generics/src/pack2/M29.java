package pack2;

class N<X> {
	X obj;
}
public class M29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N<? super Q> n1 = null;
//		n1 = new N<R>();//CTE
//		n1 = new N<S>();//CTE
//		n1 = new N<String>();//CTE
//		n1 = new N<Number>();//CTE
		n1 = new N<P>();
		n1 = new N<Q>();
	}
}
/*
here datatype of N should be either Q type or super class of Q

*/
