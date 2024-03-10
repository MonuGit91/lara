import java.util.*;

class U{
	public static void main(String[] args){
		System.out.println("main begin");
		//int i = 1;
		do {
			int i = 1;
			System.out.println("body begin: " + i);
			System.out.println("body end: " + i);
			i++;
		}
		while(i <= 5);

		System.out.println("main end");

	}
}
/*
V.java:13: error: cannot find symbol
		while(i <= 5);
		      ^
  symbol:   variable i
  location: class U
*/
/*
here after while(i <= 5) ";" should be there since it is part of syntax
*/
