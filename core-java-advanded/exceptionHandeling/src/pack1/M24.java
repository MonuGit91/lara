package pack1;

import java.util.Scanner;

public class M24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sone thing");
		String s1 = sc.next();
		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			int k  = i / (i-9);// it can also give exception
		}
		catch(NumberFormatException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}

}
/*
 * give 3 different input as
 * 1. input: 22
 * output: no error
 * 
 * 2. input: 9
 * output: ArithmeticException as i-9 : 9-9 = 0
 * 
 * 3. input: abc
 * output: NumberFormatException
 * 
 * 
 */
