import java.util.*;

class E{
	private E() {
		System.out.println("E()");
	}
	public static void main(String[] args){
		E e1 = new E();
	}
}
/*
-here all 4 access Modifiers can be used for constructor
-all property of Access Modifiers will apply to constructor also
*/