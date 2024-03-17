package pack1;

class S extends Thread{
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s1 = new S();
		s1.start();
		try {
			s1.join();//ie, main thread is going to wait untill child thread getting over
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}

}
