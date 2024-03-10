import java.util.*;

class Z5{
	public static void main(String[] args){
		System.out.println("main begin");
		boolean b1 = true;
		if(b1 = !b1) {
			System.out.println("from if1");
			System.out.println("from if2");
			System.out.println("from if3");
		}
		System.out.println("main end" + b1);
	}
}
