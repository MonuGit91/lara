import java.util.*;

class H{
	static int p=10;
	
	public static void main(String[] args){
		System.out.println("a:"+p);//0
		System.out.println("b:"+H.p);//0
		H obj = new H();
		System.out.println("c:"+obj.p);//30

	}
}
/*
class h:-
whe can asses static member
	-with stright away
	-with class name
	-with refrence variable of object

class g:-
-at the time of class loding static members will lode
-IIB will run at the time of object creation before constructor call


class f:-
-even there is calling mulitple constructor for one object creaition IIB will
 execute only one time

class b:-
IIB : Instant Initialization Block
-all IIB will be executing for every object creation before the constructor
-we can have multiple IIB and all IIB will execute top to bottom
*/
