abstract class A{
	abstract void test();
}
class H extends A {
	void test(int i) {}
    public static void main(String[] args) {
        System.out.println("done");
    }
}
/*
CTE: because-
it is overloading and we have not defined H as abstract 
*/