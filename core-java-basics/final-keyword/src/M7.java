final class A{}
class B extends A{}
class M7{
	public static void main(String[] args) {
		System.out.println("main");
	}
}
/*
error: cannot inherit from final A

class can have final
final class can not have a subclass
*/