abstract class A{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}
abstract class M extends A{
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
		//M obj = new M();
		//obj.test1();
		//obj.test2();
		System.out.println("done");

	}
}

/*
m:-
how to successfully compile L.java
k:-
Q. here why we does not requere abstract in J class?
ans. because we have difined abstract method of class A.
*/
