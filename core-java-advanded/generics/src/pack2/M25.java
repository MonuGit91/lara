package pack2;

class J <X>{
	X obj;
}
public class M25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J<? extends Number> i1 = null;
//		i1 = new J<P>();//CTE
//		i1 = new J<String>();//CTE
//		i1 = new J<Object>();//CTE
		System.out.println("done");
	}

}
/*
here CTE beause  String and Object is not extended Number


*/