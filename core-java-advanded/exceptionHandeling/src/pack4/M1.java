package pack4;

public class M1 {
	public static void main(String[] args) {
		int i = 10/0;
		int j = Integer.parseInt("abc");
		String s1 = null;
		int k = s1.length();
		int[] elements = new int[5];
		Object obj1 = new Integer(90);
		String str = (String)obj1;
		main(null);
		int[] array = new int[999999999];
	}
}
/*
all are unchecked error so does not required to check by compiler

*/