import java.util.*;

class J{ 
	static {
		System.out.println(J.i);
	}
	static int i;

	public static void main(String[] args){
		System.out.println("done");
	}
}
/*
J:-
-indirect read so it is not giving error

-direct read that's why getting error

*/
