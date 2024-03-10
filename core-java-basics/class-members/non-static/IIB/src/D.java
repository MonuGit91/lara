import java.util.*;

class D{
	{
		System.out.println("IIB1");
	}
	D(){
		System.out.println("D()");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		D obj1 = new D();
		System.out.println("main end");

	}
}
/*
class b:-
IIB : Instant Initialization Block
-it is executing for every object creation before the constructor
-we can have multiple IIB and all IIB will execute top to bottom
*/
