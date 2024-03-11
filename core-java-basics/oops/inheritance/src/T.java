import java.util.*;

class A{
	A(int i) {
		System.out.println("A(int)");
	}
}
class T extends A{
	T(int i) {
		//super();
		System.out.println("T(int)");
	}
	public static void main(String[] args){
		T t1 = new T(90);
		System.out.println("main");

	}
}
/*
CTE:
*/