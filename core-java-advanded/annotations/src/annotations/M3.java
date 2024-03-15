package annotations;

@interface A3{
	int version();
	String author();
}

@A3(version = 3, author = "abc")
public class M3 {
	
	@A3(version = 4, author = "xyz")
	public static void main(String[] args) {
		System.out.println("main");
	}
}

/*
we shoudld description to provide every method

*/