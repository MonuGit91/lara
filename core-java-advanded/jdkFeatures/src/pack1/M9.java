package pack1;
interface Ga{
	default void test() {
		System.out.println("from A-->test");
	}
}
interface Ha{
	default void test() {
		System.out.println("form B==>test");
	}
}

class Ia implements Ga, Ha{
	public void test() {
		System.out.println("form B==>test");
	}
}
public class M9 {
	public static void main(String[] args) {
		Ia i1 = new Ia();
		i1.test();
		System.out.println("done");
	}
}
/*
now no CTE because we have overrided  Ga and Ha


*/