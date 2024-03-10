import java.util.*;

class O{
	public static void main(String[] args){
		System.out.println("main begin");
		if(true){
			System.out.println("if block");
			return;
		}
		System.out.println("main end");
	}
}
/*
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
