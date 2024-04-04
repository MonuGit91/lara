package pack5;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = {10, 20, 30, 50, 110};
		IntStream intStream = Arrays.stream(elements);
		intStream.forEach(System.out::println);
		System.out.print("----------");
		
		double[] heights = {4.5, 5.9, 6.1, 5.7};
		DoubleStream doubleStream = Arrays.stream(heights);
		doubleStream.forEach(System.out::println);
	}

}
