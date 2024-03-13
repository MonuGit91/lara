package pack6;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new AgeIsNegativeException("Age Should be Grater then 0");
		}
		System.out.println(2);
	}

}
