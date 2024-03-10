import java.util.*;
class A{
	private int i;
}
class N extends A{
	public static void main(String[] args){
		N n1 = new N();
		System.out.println(n1.i);

	}
}
/*
N.java:8: error: i has private access in A
		System.out.println(n1.i);
		                     ^
*/