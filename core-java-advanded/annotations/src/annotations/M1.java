package annotations;

@interface A1{
	String someDesc();
}
@A1(someDesc="some desc about A1")//description to M1
public class M1 {
	@A1(someDesc="some desc about main")//description to Main
	public static void main(String[] args) {
		
	}
}
/*
-annotations are used to provide some description to a class, method, feild, attributes
-annotations are only for providing description it can not print

*/