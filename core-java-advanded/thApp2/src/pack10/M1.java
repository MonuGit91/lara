package pack10;

import java.util.ArrayList;

class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class CommonTaskThread extends Thread {
	public void run() {
		while (true) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " by " + getName());
				synchronized (this) {
					notify();
				}
			}
		}
	}
}

class ThreadPoolManager {
	private ArrayList<CommonTaskThread> pool = new ArrayList<CommonTaskThread>();

	public void init() {
		CommonTaskThread ct = null;
		for (int i = 1; i <= 10; i++) {
			ct = new CommonTaskThread();
			ct.start();
			pool.add(ct);
		}
	}

	public CommonTaskThread checkOut() {
		CommonTaskThread ct = null;
		if (pool.size() > 0) {
			ct = pool.remove(0);
		} else {
			ct = new CommonTaskThread();
			ct.start();
		}
		return ct;
	}

	public void checkIn(CommonTaskThread ct) {
		if (pool.size() < 10) {
			pool.add(ct);
		}
		else {
			ct = null;
		}
	}
	public void release() {
		CommonTaskThread ct = null;
		for(int i = 0; i < pool.size(); i++) {
			ct = pool.remove(0);
			ct = null;
		}
	}
}
class Customer1 extends Thread{
	private ThreadPoolManager tpm;
	Customer1(ThreadPoolManager tpm){
		this.tpm = tpm;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("customer1 is trying to get thread form the pool ");
			CommonTaskThread ct = tpm.checkOut();
			synchronized (ct) {
				ct.notify();
			}
			synchronized (ct) {
				try {
					ct.wait();
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				System.out.println("customet1 sending used thread back to the pool");
				tpm.checkIn(ct);
				Util.sleep(1000);
			}
			
		}
	}
}

class Customer2 extends Thread{
	private ThreadPoolManager tpm;
	Customer2(ThreadPoolManager tpm){
		this.tpm = tpm;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("customer2 is trying to get thread form the pool ");
			CommonTaskThread ct = tpm.checkOut();
			synchronized (ct) {
				ct.notify();
			}
			synchronized (ct) {
				try {
					ct.wait();
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				System.out.println("customet2 sending used thread back to the pool");
				tpm.checkIn(ct);
				Util.sleep(1000);
			}
			
		}
	}
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolManager tpm = new ThreadPoolManager();
		tpm.init();//initialization
		
		Customer1 c1 = new Customer1(tpm);
		c1.start();
		
		Customer2 c2 = new Customer2(tpm);
		c2.start();
		
		Util.sleep(1000*1000);
		
		c1.stop();
		c2.stop();
		Util.sleep(2000);
		tpm.release();
		System.out.println("end of the game");
		
	}
}

/*
 * wait
 * common task
 * notify
 * 
 * 
 * 
 * 
 * 
 */
