package pack1;

public class M9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
	}

}
