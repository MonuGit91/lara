package pack1;

class G extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread() + "  : " + i);
		}
	}
}
public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g1 = new G();
		g1.start();
//		g1.run();
		for(int i = 2000; i <= 3000; i++) {
			System.out.println(Thread.currentThread().getName()+" : " + i);
		}
	}

}
/*
start() will start running the thread with mian thread

*/