package pack1;

class K <X> {
	void test(X obj) {
		
	}
}
public class M11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K<Integer> k1 = new K<Integer>();
		K<String> k2 = new K<String>();
		K<Double> k3 = new K<Double>();
		
		k1.test(10);
		k2.test("abc");
		k3.test(3.5);
		System.out.println("done");
	}

}
/*
Through generics we can achieve data type changing form one type to another type.


*/