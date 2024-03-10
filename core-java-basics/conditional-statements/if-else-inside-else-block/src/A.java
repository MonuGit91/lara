import java.util.*;

class A{
	public static void main(String[] args){
		System.out.println("main begin");
		if(true) 
			System.out.println("if-body");
		else if(false)
			System.out.println("else if begin");
			else if(true) 
				System.out.println("else if body");
		System.out.println("main end");
	}
}
