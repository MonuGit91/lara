import java.util.*;

class J{
	static int count;
	J(){
		count++;
	}
	
	public static void main(String[] args){
		J obj1 = new J();
		System.out.println("a:"+count);
		J obj2 = new J();
		System.out.println("b:"+count);
		J obj3 = new J();
		System.out.println("c:"+count);
		J obj4 = new J();
		System.out.println("d:"+count);

		System.out.println("e:"+obj1.count);
		System.out.println("f:"+obj2.count);
		System.out.println("g:"+obj3.count);
		System.out.println("h:"+obj4.count);

	}
}
/*
J:-
-even we are using refrence variable to access static members compiler will replace that refrence variable with Class name


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
