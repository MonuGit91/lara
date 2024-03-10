import java.util.*;

class K{ 
	static int i = 20;
	static {
		i = 100;
	}

	public static void main(String[] args){
		System.out.println(i);
	}
}
/*
J:-
-indirect read so it is not giving error

-direct read that's why getting error

*/
