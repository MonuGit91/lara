package pack1;

import java.util.Scanner;

public class M31 {
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
		catch(NumberFormatException ex) {
			System.out.println(4);
		}
		finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
/*
 *input1: 18  
 *input2: 9
 *input3: tttt
 *
 *
 * finally block will definitely run no matter raised exception is handled or not
 * if you have any mandatory statement then keep those statement in finally block
 * if control intered inside try block then no matter what ever happen finally block will definitely will run 
 */







