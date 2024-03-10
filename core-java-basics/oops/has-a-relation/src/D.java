class A {
	int i;
	void test1(){
		System.out.println("A-test1");
	}
}
class D{
	A obj;
	void test2(){
		System.out.println("D-test2");
		System.out.println(obj.i);
		obj.test1();
	}

    public static void main(String[] args) {
        D d1 = new D();
        d1.test2();
    }
}
/*
here obj.i, obj.test2() will give NPE because at the creation of object of D obj is assigned with null


C has A type of property or variable
so it is "has-a" relation
here members of class A can't be used directly in C
*/
