package pack1;

class  D extends Thread{
	Thread mainThread;
	D(Thread mainThread){
		this.mainThread = mainThread;
	}
	@Override
	public void run() {
		try {
			sleep(100);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("state of main thread: " + mainThread.getState());
	}
}
public class M5 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		D d1 = new D(t1);
		try {
			d1.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
/*
Q. what is the state of thread when it is joined thread
ans. wait

-for foin and wait state will be wait

-if states is gong to be in deadlock then state will be block

*/