import java.util.*;

class Z3{
	public static void main(String[] args){
		boolean b1 = true;
		System.out.println(b1 || !(b1));
		System.out.println(b1 && (!b1));
		System.out.println((!b1) && (!b1));
		System.out.println((!b1) || (!b1));
		System.out.println(b1);

	}
}
