import java.util.*;

class L{
	static int count;
	L(){
	}
	L(int i) {
	}
	L(int i, int j) {
	}
	{
		count++;
	}
	
	public static void main(String[] args){
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L(20);
        L obj4 = new L();
        L obj5 = new L();
		L obj6 = new L(1, 4);
		L obj7 = new L();
        L obj8 = new L(4);
		L obj10 = new L();
		L obj9 = new L(7, 6);

		System.out.println(count);
	}
}
/*
j:-
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
