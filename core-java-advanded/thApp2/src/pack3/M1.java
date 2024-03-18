package pack3;

class A{
	synchronized static void test1() {
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 1000; i++) {
			System.out.println("form test1 with " + i + " i " + t1.getName());
		}
	}

	synchronized static void test2() {
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 1000; i++){
			System.out.println("from test2 with " + i + " by " + t1.getName());
		}
	}
}
class Thread1 extends Thread{
	public void run() {
		A.test1();
	}
}
class Thread2 extends Thread{
	public void run() {
		A.test2();
	}
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		Thread t2 = new Thread2();
		t2.start();
	}

}

/*
 * 
 * 
 * 
 * 
 * 
 */
