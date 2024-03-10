abstract class A{
	abstract void test1();
	void test2(){
		System.out.println("A-test2");
	}
}
class J extends A{
	void test1(){
		System.out.println("J-test1");
	}
	public static void main(String[] args){
		J obj = new J();
		obj.test1();
		obj.test2();
		System.out.println("done");

	}
}
/*
Q. here why we does not requere abstract in J class?
ans. because we have difined abstract method of class A.
*/
