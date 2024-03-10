class A {
	int i;
	void test1(){
		System.out.println("A-test1");
	}
}
class C{
	A obj;
	void test2(){
		System.out.println("C-test2");
		System.out.println(i);
		test1();
	}

    public static void main(String[] args) {
        C b1 = new C();
        b1.test2();
    }
}
/*
C has A type of property or variable
so it is "has-a" relation
here members of class A can't be used directly in C
*/
