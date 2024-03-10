import java.util.*;

//Q. what is for loop explain it's flow
class A{
	public static void main(String[] args){
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++) {
			System.out.println("loop body: " + i);
		}
		System.out.println("main end");

	}
}
/*
int i = 1, i <= 5 =>
1 <= 5 ==>true 
loop body :1
i = 2, 2 < 5==> true
loop body: 2
i = 3, 3 < 5 ===>true
loop body:3
i= 4, 4 <= 5 ===>true loop body:4
i = 5, 5 < 5 ===>true
loop body:5

*/
/*
-initialization executes only once
-boolean section executes every time including 1st iteratiron
-change section executes 2nd iteration onwards not in 1st iteratio
-when boolean condition section is true then only control will go to body of the loop
-the last executable section for the for loop is boolean section
*/
