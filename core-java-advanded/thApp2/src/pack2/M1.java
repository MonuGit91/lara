package pack2;

class Shared {
	 void test1() {
		Thread t1 = Thread.currentThread();
		
		synchronized(this) { // we are synchronizing the portion insted of synchronizing complete method
			for(int i = 1; i <= 1000; i++) {
				System.out.println("from test1 " + i + " by " + t1.getName());
			}
		}
		
	}
	
	 void test2() {
		Thread t1 = Thread.currentThread();
		
		synchronized(this) {//synchronized(mutex) // we are synchronizing the portion insted of synchronizing complete method
			for(int i = 1; i <= 1000; i++) {
				System.out.println("from test2 " + i + " by " + t1.getName());
			}
		}
		
	}
	
}
class Thread1 extends Thread{
	Shared s1;
	Thread1(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();
	}
}
class Thread2 extends Thread{
	Shared s1;
	Thread2(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();
	}
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s1);
		
		t1.start();
		t2.start();
//		s1.test1();
		s1.test2();
		
	}

}