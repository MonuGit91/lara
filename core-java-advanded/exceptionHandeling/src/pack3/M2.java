package pack3;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		main(null);//StackOverflowError
		System.out.println("---------");
		int[] elements = new int[999999990];//OutOfMemoryError
		System.out.println("----------");
		System.out.println("main end");
	}

}
/*

StackOverflowError:- because in heap memory this much space is not available

*/