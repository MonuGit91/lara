class A {
	int i;
	void test1(){
		System.out.println("A-test1");
	}
}
class F{
	A obj = new A();
	F(A obj){
		this.obj = obj;
	}
	void test2(){
		System.out.println("F-test2");
		System.out.println(obj.i);
		obj.test1();
	}

    public static void main(String[] args) {
        A a1 = new A();
		F f1 = new F(a1);
		f1.test2();
		F f2 = new F(new A());
		f2.test2();
    }
}
/*
E:-


d:-
here obj.i, obj.test2() will give NPE because at the creation of object of D obj is assigned with null


C has A type of property or variable
so it is "has-a" relation
here members of class A can't be used directly in C
*/
