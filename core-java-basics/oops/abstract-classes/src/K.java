abstract class A{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}
class K extends A{
	void test1(){
		System.out.println("K-test1");
	}
	void test2(){
        System.out.println("K-test2");
    }
	void test3(){
        System.out.println("K-test3");
    }
	void test4(){
        System.out.println("K-test4");
    }
	public static void main(String[] args){
		K obj = new K();
		obj.test1();
		obj.test2();
		System.out.println("done");

	}
}
/*
k:-
Q. here why we does not requere abstract in K class?
ans. because we have difined abstract method of class A.
*/
