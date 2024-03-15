package annotations;

@interface A5{
	int version() default 1;
	String author();
}

//no CTE because default value of version is 1
@A5(author = "abc")
public class M5 {
	
	@A5(version = 4, author = "xyz")
	public static void main(String[] args) {
		System.out.println("done");
	}
}