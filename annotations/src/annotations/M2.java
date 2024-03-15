package annotations;

@interface A2{
	int someDesc();
}
@A2(someDesc = 100)
public class M2 {
	@A2(someDesc = 20)
	public static void main(String[] args) {
		System.out.println("main");
	}
}
