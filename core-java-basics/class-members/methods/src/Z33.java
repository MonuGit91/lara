import java.util.*;

class Z33{
	public static void main(String[] args){
		System.out.println("main begin");
		int i=1;
		int j = test(i++)+i;
		System.out.println("main end: "+i+","+j);
	}
	public static int test(int i) {
		System.out.println("from test:"+i);
		return i++;
}
}
/*
Z18:-
-2 variables can't be defined with same name


Z9:-
derived data type:
1. all classes
2. all Interfaces
3. all enum
here String is a class so it is derived data type

Z6:-
error: variable i might not have been initialized
		return i;

Z2:
-i tought: 
this programs will give CTE because 100 by default considered as int type and it is storing in byte 
-but:
	program compile and run successfully


U:-
-here return value should be int but here boolean is there
-return type decides which type of value should be returned by return statement


S:-
-premitive data types: data type which is pre defined for programming language:- 
1. byte
2. short
3. int
4. long
5. float
6. double
7. char 
8. boolean

-whenever return type is other then void then they should be return statement with value it is mendatory
-if method return 

-error: missing return statement

R:-
error: invalid method declaration; return type required

Q:-
-return type should be before method name 
-public static can be in any order


N:-
reurn statement should be last statement of current block
here it will give cte

M:-
void means should not return any thing 
here we are return 200 so it will give CTE


-every method should have return statement
-return type should written before method name
-if return type is void then return statement is optional


H:-
-sop should be always there inside method only

G:-
-i of main method only visible to main method
-i of test method only visible to test method

-methods are mainly for achiving reusablity
-we can use same reusable code again and again

*/
