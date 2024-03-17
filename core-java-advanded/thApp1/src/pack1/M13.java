package pack1;

public class M13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
//		t1.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
	}

}
/*
Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIRITY = 10



*/