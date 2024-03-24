package pack2;

class A<X extends R>{
	X obj;
}
public class M16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A<R> a1 = new A<R>();
		A<S> a2 = new A<S>();
		A<T> a3 = new A<T>();
		System.out.println("done");
				
	}

}
/*
X extends R means X Should be either R or sub class to R
so here we can supply only R type, S type and T type 
we can not supply P type, Q type and other type like Integer type

*/