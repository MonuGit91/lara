abstract class A{
	abstract void test();
}
abstract class I extends A{
	void test(int i) {}
	public static void main(String [] args){
		System.out.println("done");
	}
}
/*
this will not give error because haere I is now abstract
*/