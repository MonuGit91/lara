package pack1;

import java.util.Scanner;

public class M28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sone thing");
		String s1 = sc.next();
		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			int k  = i / (i-9);// it can also give exception
			System.out.println(3);
			int[] e = new int[10];
			int m = e[i];
			System.out.println(4);
		}
		catch(ArithmeticException ex) {
			System.out.println(5);
		}
		catch(NumberFormatException ex) {
			System.out.println(6);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(7);
		}
		System.out.println(8);
	}
}
/*input1: abc
 * input2: 9 
 * input3: 3
 */
