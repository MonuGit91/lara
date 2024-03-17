package pack1;

class O extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from O thread: " + getPriority());
	}
}
class P extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from O thread: " + getPriority());
		O th1 = new O();
		th1.start();
	}
}
public class M18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setPriority(10);
		P p1 = new P();
		p1.start();
	}

}
/*
 * Main thread priority is 5
 * child thread priority = parent thread priority
 * 
 * 
 * 
 * 
 * 
 */
