package pack5;

class A{
	static A obj;
	protected void finalize() throws Throwable{
		obj = this;
		System.out.println("form finalize");
	}
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		System.out.println(1 + " : " + a1);
		System.out.println(2 + " : " + A.obj);
		Util.sleep(1000);
		a1 = null;
		System.gc();
		Util.sleep(1000);
		System.out.println(3 + " : " + a1);
		System.out.println(4 + " : " + A.obj) ;
		A.obj = null;
		Util.sleep(1000);
		System. gc() ;
		System.out.println(5 +": " + a1) ;
		System.out.println(46 + " : " + A. obj) ;
		//Runtime.getRuntime().gc();
		System. out. println ("end");
	}

}

class Util{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
}

/*
Finalize
=========




*/