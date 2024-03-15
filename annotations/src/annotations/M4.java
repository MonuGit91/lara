package annotations;

@interface A4{
	int version();
	String author();
}

//@A3(author = "abc")//CTE 
public class M4 {
	
	@A4(version = 4, author = "xyz")
	public static void main(String[] args) {
		System.out.println("main");
	}
}

/*
CTE because we shoudld description to provide every method

*/