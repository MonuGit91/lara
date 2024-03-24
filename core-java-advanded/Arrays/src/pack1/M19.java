package pack1;

import java.util.Arrays;

public class M19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x = new int[5];
		System.out.println("-----one way of reading-------");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		System.out.println("-----second way of reading-------");

		
		for(int i : x) {
			System.out.print(i + ", ");
		}
		System.err.println();
		System.out.println("------third way of reading------");
		
		
		System.out.println(Arrays.toString(x));
	}

}
/*
Arrays.toString(arr)


*/