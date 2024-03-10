class A{
	void test(){
		System.out.println("A.test");
	}
}
class G extends A {
	protected void test(){
		System.out.println("G.test");
	}
    public static void main(String[] args) {
        System.out.println("done");
    }
}
/*
here in G class test() access specifire can be same as test method of A or wider then that only.
*/