import java.util.*;

class P{
	public static void main(String[] args){
		if(args.length < 1) {
			System.out.println("supply one command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch(i) {
			case 1: 
				int x = 100;
				System.out.println("from case 1");
				System.out.println("from case 1");
				System.out.println("from case 1");
				System.out.println("from case 1");
				break;
			
			case 5:
				System.out.println("from case 5");
				System.out.println("from case 5");
				break;
			default:
				System.out.println("from default");
				System.out.println("from default");
				break;
		}
		System.out.println("main end");
	}
}
