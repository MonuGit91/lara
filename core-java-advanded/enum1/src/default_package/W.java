package default_package;

enum V{
	C1, C2, C3;
	V(){//constructor
		System.out.println("V()");
	}
}
public class W {
	public static void main(String[] args) {
		V v1 = V.C3;
		System.out.println(v1);
	}
}
/*
-if we do not provide constructor then compiler will porvide default constructor
- for every constant constructor will execute

*/