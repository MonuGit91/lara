class A{
	byte test(){
		System.out.println("A.test");
		return 10;
	}
}
class D extends A {
	int test(int i){
		System.out.println("B.test");
		return 100;
	}
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}