package test;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int min = 7;
//		min = 8;

		list.forEach(val -> {
			
			System.out.println(min); //CTE because
			/*
			 * variables used inside lambda expressions 
			 * must be effectively final. This means that the variable 
			 * should not be modified after it is initialized. 
			 */
		});
	}
}