package default_package;


enum En {
	C1, C2, C3, C4;//all identifiers should be unique ans seperated by ,
}

public class F{
	public static void main(String[] args) {
		System.out.println( En.C1);
		System.out.println(En.C3);
	}
}