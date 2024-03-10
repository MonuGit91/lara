import java.util.*;

class C{
	public static void main(String[] args){
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++) {
			System.out.println("loop body: " + i);
			System.out.println("loop body: " + i);
			int j = 30;
			j++;
			j += 20;
			System.out.println("-------------:" + j);
		}
		System.out.println("main end");
	}
}
/*
-i and j are both are local to for loop
-i and j can ont used outside of for loop
*/
