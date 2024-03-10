import java.util.*;

class E{
	{
		System.out.println("IIB1");
	}
	E(){
		System.out.println("E()");
	}
	E(int i){
        System.out.println("E(int)");
    }
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		E obj1 = new E();
		System.out.println("-----------");
		E obj2 = new E(20);
		System.out.println("-----------");
		System.out.println("main end");

	}
}
/*
class b:-
IIB : Instant Initialization Block
-all IIB will be executing for every object creation before the constructor
-we can have multiple IIB and all IIB will execute top to bottom
*/
