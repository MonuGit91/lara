import java.util.*;
abstract class A{
	abstract A();
}
class S{
	public static void main(String[] args){
		System.out.println("done");

	}
}
/*
CTE:
error: modifier abstract not allowed here
	abstract A();
	         ^

-a constructor can not be abstract
*/