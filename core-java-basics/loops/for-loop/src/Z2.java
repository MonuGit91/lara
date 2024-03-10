import java.util.*;

class Z2{
	public static void main(String[] args){
		System.out.println("main begin");
		for(int i = 0; i <= 5; i++) 
			System.out.println("loop body: " + i);
			System.out.println("loop body: " + i);
			System.out.println("main end");
		
	}
}
/*
error: cannot find symbol
			System.out.println("loop body: " + i);
			                                   ^
  symbol:   variable i
  location: class Z2

  // because i is not accessabel out side for loop
  // here inside for loop only one statement will be considered

*/
