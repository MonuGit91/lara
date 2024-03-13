package pack3;

public class M4 {
	public static void main(String[] args) {
		System.err.println("main begin");
		try {
			System.out.println(1);
			int[] e = new int[999999990];
			System.out.println();
		}
		catch(OutOfMemoryError err) {
			System.out.println(3);
		}
		System.out.println("main end");
	}
}
/*
what is unchecked error
what is checked exception
every error and every run time time exception comed under unchecked
compiler does'nt chececk 
throable and exception both comes under sami checked

*/