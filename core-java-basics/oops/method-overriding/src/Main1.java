class A{
	static final int i = 10;
	int j = 10;
}
class B extends A{
	static final int i = 20;
	int j = 20;
}
class Main1 {
    public static void main(String[] args) {
        B obj = new B();
        A a = obj;
        B b = obj;
        System.out.println(a.i + " " + a.j);
        System.out.println(b.i + " " + b.j);
    }
}
/*
output:
10 10
20 20

-here static and final vairable is being overrided but point is that "if we create object after overriding then object will call then variable in which it stored" 
	ie, if we created a object of B then 
			-when we store object in A's variable then it will call A's i and j
			-when we store object in B's variable then it will call B's i and j 
*/