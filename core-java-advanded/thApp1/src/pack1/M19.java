package pack1;

class Q extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q1 = new Q();
		q1.start();
		System.out.println("done");
	}

}
/*
-child thread is user thread it do not depends on it's parent thread.
so user thread will complete it's task no matter parent thread is executing or not


*/