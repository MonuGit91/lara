package pack1;

class R extends Thread{
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r1 = new R();
		r1.setDaemon(true);
		r1.start();
		System.out.println("done");
	}

}
/*





*/