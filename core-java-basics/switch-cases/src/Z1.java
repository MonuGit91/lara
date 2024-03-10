import java.util.*;

class Main{
	public static void main(String[] args){
		System.out.println("main begin");
		int i = 10;
		final int j;
		j = 10;
		switch(i) {
			case 5:
				System.out.println("from case 5");
				break;

			case j:
				System.out.println("from case 10");
				break;
		}
		System.out.println("main end");

	}
}
