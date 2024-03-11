import java.util.*;

class F{
	{
		System.out.println("IIB1");
	}
	F(){
		this(90);
		System.out.println("F()");
	}
	F(int i){
        System.out.println("F(int)");
    }
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args){
		System.out.println("main begin");
		F obj1 = new F();
		System.out.println("-----------");
		F obj2 = new F(20);
		System.out.println("-----------");
		System.out.println("main end");

	}
}
/*
class f:-
-even there is calling mulitple constructor for one object creaition IIB will
 execute only one time of a class.

class b:-
IIB : Instant Initialization Block
-all IIB will be executing for every object creation before the constructor
-we can have multiple IIB and all IIB will execute top to bottom
*/
