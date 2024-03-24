package pack1;

class M<T, U>{
	T obj1;
	U obj2;
	void test1(T t1) {
		
	}
	U test2() {
		return null;
	}
	
}
public class M13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M<Integer, String> m1 = new M<Integer, String>();
		M<String, String> m2 = new M<String, String>();
		M<Double, Integer> m3 = new M<Double, Integer>();
		M<String, Integer> m4 = new M<String, Integer>();
		
		m1.obj1 = 10;
		m2.obj2 = "abc";
		
		m2.obj1 = "hello";
		m2.obj2 = "test";
		
		m3.obj1 = 4.4;
		m3.obj2 = 55;
		
		m4.obj1 = "xyz";
		m4.obj2 = 59;
		
		m1.test1(30);
		String s1 = m1.test2();
		System.out.println("done");
	}

}
