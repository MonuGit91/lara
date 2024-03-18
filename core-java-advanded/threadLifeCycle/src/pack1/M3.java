package pack1;

class B extends Thread{
	@Override
	public void run() {
		try {
			sleep(10000);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
public class M3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.start();
		Thread.sleep(2000);
		System.out.println(b1.getState());

	}

}
