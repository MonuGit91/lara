package pack3;

public class M3 {
	static void m1() {
		System.out.println("from m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = M3::m1;//test1 of A interface is getting implemented by m1()
		a1.test1();
	}

}
/*
-double color operator(::) or scope resolution operator is the operator which is used to 
refer an already existing method through functional interface method.
where method can be static, not static or constructor.
*/