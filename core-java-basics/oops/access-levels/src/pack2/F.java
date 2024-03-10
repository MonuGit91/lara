package pack2;

import pack1.A;

class F extends A{
	public static void main(String[] args){
		A a1 = new A();
		//System.out.println(a1.x);//private member so out side of package can not access
		//System.out.println(a1.y);//protected member so can be accessed within package and child class in out side package
		System.out.println(a1.z);

		F f1 = new F();
		//System.out.println(f1.x);//private to 
		System.out.println(f1.y);
		System.out.println(f1.z);

	}
}
