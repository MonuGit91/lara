import java.util.*;

class S{
	public static void main(String[] args){
		System.out.println("main begin");
		int i = 1;
		do {
			System.out.println("body begin: " + i);
			System.out.println("body end: " + i);
			i++;
		}
		while(i <= 5);
		System.out.println("main end");

	}
}
/*
-boolean condition is not checked in 1st iteration 
-boolean condition is checked after 1st iteration
-in case of for and while loop boolean condition is checked form 1st iteration
-what ever we have decleared to terminate loop should used in while condition 
*/
