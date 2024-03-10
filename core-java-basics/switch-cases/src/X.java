import java.util.*;

class X{
	enum En {c1, c2, c3, c4};
	public static void main(String[] args){
		System.out.println("main begin");
		En e1 = En.c3;
		switch(e1) {
			case c1:
				System.out.println("from case c1");
				break;

			case c2:
				System.out.println("from case c2");
				break;

			case c3:
				System.out.println("form case c3");
				break;

			case c4:
				System.out.println("from case c4");
				break;
		}
		System.out.println("main end");
	}
}
