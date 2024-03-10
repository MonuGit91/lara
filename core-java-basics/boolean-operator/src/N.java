import java.util.*;

class N{
	public static void main(String[] args){
		int i = 10;
		int j = 10;
		int k = 20;

		System.out.println((i == 10) || true);
		System.out.println(true || (i == 10));
		System.out.println((j == 10) || true);
		System.out.println(true || (j == 10));
		System.out.println((i ==j) || true);
		System.out.println(true|| (i==j));
		System.out.println((i==j) || true);
		System.out.println(true || (j==i));
		System.out.println(false || (j==i));
		System.out.println(true|| (j==k));
		System.out.println(false|| (j==k));
		System.out.println(true|| (i==k));
		System.out.println((i == j)|| (i==k));
		System.out.println((i == j)|| (j==k));
		System.out.println((i != j)|| (j==k));
		System.out.println((i != j)|| (j!=k));
		
	}
}
