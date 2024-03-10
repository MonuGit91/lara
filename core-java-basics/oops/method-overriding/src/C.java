class A{
	byte test(){
		System.out.println("A.test");
		return 10;
	}
}
class C extends A{
	int test(int i) {
		System.out.println("B.test(int i)");
		return 100;
	}
	public static void main(String[] args){

	}
}
/*
it is commint under overloading because of different signature
*/