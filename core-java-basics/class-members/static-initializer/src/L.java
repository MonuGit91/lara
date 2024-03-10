import java.util.*;

class L{
	static int i = test();//4
	public static int test() {
		i = 1;
		main(null);
		System.out.println("test end:" + i);//6
		i = 2;
		return i+2;//4
	}
	public static void main(String[] args){
		System.out.println("main: "+i);//1 //3 //8
		i += 5;// 1+=5 = 6 //3+=5 = 8 //8+=5 = 13
	}
	static {
		System.out.println("SIB begin: " + i);//4
		i = 3;
		main(null);
		System.out.println("SIB end: " + i);//8
	}
}
/*
K<***>:-
-we can call main method also

E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
