abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}

abstract class B extends A
{
	void test2()
	{
		System.out.println("B-test2");
	}

	void test3()
	{
		System.out.println("B-test3");
	}
}

class  N extends B
{
	void test4()
	{
		System.out.println("N-test4");
	}

	void test1()
	{
		System.out.println("N-test1");
	}
	public static void main(String[] args) 
	{
		N obj = new N();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}

/*
abstract class A{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}
abstract B extends A{
	void test2(){
        System.out.println("B-test2");
    }
	void test3(){
        System.out.println("B-test3");
    }
}
class N extends B{
	void test4(){
        System.out.println("N-test4");
    }
	void test1(){
        System.out.println("N-test1");
    }
	public static void main(String[] args){
		N obj = new N();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("done");

	}
}
*/
/*
m:-
how to successfully compile L.java
k:-
Q. here why we does not requere abstract in J class?
ans. because we have difined abstract method of class A.
*/
