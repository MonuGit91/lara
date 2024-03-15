package annotations;

@interface A6{
	int version() default 1;
	String author() default "vijay";
}


@A6(author = "abc")
public class M6 {
	
	@A6(version = 4, author = "xyz")
	public static void main(String[] args) {
		System.out.println("done");
	}
}

/*
now we can remove both values in annotation because we have already diven defaul value

*/