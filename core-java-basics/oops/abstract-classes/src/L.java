abstract class A{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}
class L extends A{
	void test1(){
        System.out.println("K-test1");
    }
	void test2(){
        System.out.println("K-test2");
    }
	void test3(){
        System.out.println("K-test3");
    }
	public static void main(String[] args){
		J obj = new J();
		obj.test1();
		obj.test2();
		System.out.println("done");

	}
}
/*
L:-
it will not compile successfully because we have not implemented test4()

k:-
Q. here why we does not requere abstract in J class?
ans. because we have difined abstract method of class A.
*/
