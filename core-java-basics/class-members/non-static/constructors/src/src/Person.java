import java.util.*;

class Person{
	String firstName;
	int age;
	Person(String firstName, int age){
		this.firstName = firstName;
		this.age = age;
	}
	public static void main(String[] args){
		Person p1 = new Person("vijay", 22);
		Person p2 = new Person("Raghu", 24);
		Person p3 = new Person("Ravi", 25);
		System.out.println(p1.firstName + ", " + p1.age);
		System.out.println(p2.firstName + ", " + p2.age);
		System.out.println(p3.firstName + ", " + p3.age);
	}
}
/*
Person:-
Q. why do we required argumented constructor, what is it's need.
-if we have created any constructor then we do not have default constructor


System.out.println();
G:-
-constructor should not have a return type, mathod should have a return type
-method can have any name including class name
-here G() is a method not constructor


-constructor name = class name ****
-it should not be static ****
-it should not have any return type ****
-constructor will executed at the time object creation automatically.
-every class should have minimum one constructor
-if there is class withoud any constructor compiler will provide default constructor while compiling
-in the constructor body default this is also available
-while creating an oject you should specify available constructor
*/
