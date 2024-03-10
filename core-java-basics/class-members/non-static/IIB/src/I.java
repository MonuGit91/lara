import java.util.*;

class I{
	static int count;
	I(){
		count++;
	}
	
	public static void main(String[] args){
		I obj1 = new I();
		System.out.println("a:"+count);
		I obj2 = new I();
		System.out.println("b:"+count);
		I obj3 = new I();
		System.out.println("c:"+count);
		I obj4 = new I();
		System.out.println("d:"+count);

	}
}
/*
i:-
Q. how to identify how many object is creatid for a class
ans: by incrementing one unit to the static variable to the constructor body

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
