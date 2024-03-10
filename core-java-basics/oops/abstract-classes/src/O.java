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
}
  abstract class C extends B
  {
	void test3()
	{
		System.out.println("C-test3");
	}
}

class  O extends C
{
	void test4()
	{
		System.out.println("O-test4");
	}

	void test1()
	{
		System.out.println("O-test1");
	}
	public static void main(String[] args){
        O obj = new O();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
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
