package pack1;

public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}

}
