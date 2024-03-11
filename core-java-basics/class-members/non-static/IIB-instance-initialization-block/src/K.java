import java.util.*;

class K{
	static int count;
	K(){
		count++;
	}
	K(int i) {
		count++;
	}
	K(int i, int j) {
		count++;
	}
	
	public static void main(String[] args){
		K obj1 = new K();
		K obj2 = new K(10);
		K obj3 = new K(10, 20);
		K obj4 = new K(20);
		K obj5 = new K();
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
