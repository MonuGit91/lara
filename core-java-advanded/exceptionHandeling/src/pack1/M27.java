package pack1;

import java.util.Scanner;

public class M27 {
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
//		catch(ArithmeticException ex1) {
//			System.out.println(51);
//			int i = 10;
//			i++;
//		}
		System.out.println(6);
	}
}
/* more then one catch can not have same type of refrence variable 
 * 
 * without try catch is not possible
 * without catch try is possible with finnaly
 * */
