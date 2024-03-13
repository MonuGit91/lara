package pack1;

import java.util.Scanner;

public class M26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sone thing");
		String s1 = sc.next();
		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			int k  = i / (i-9);// it can also give exception
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(4);
		}
		catch(NumberFormatException ex) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
//one try can have any number of catch block