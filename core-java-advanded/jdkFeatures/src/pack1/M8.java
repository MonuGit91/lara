package pack1;
interface G{
	default void test() {
		System.out.println("from A-->test");
	}
}
interface H{
	default void test() {
		System.out.println("form B==>test");
	}
}

//class I implements G, H{ //CTE
//	
//}
public class M8 {
	public static void main(String[] args) {
		System.out.println("done");
	}
}
/*
compile time error at
class I implements G, H{
	
}

-CTE because if we are implementing multiple interface having same method name then 
we have to override then method


*/