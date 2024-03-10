import java.util.*;

class Z{
	public static void main(String[] args){
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("init"); test(i); System.out.println("befrore change: "+i),i++, System.out.println("after change: " + i)) {
			System.out.println("loop body: " + i);
		}
		System.out.println("main end");
	}
		static boolean test(int i) {
			boolean flag = (i <= 5);
			System.out.println("blloean status for " + i + " is " + flag);
			return flag;
		}

}
/*
- initilization section runs only once
- boolean condition section and change section will run every time
- last executing section will be boolean condition section
- we can not write SOP in condition section
*/
