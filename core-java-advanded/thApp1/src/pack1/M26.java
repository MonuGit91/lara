package pack1;

class V extends Thread{
	public void run() {
		System.out.println("run begin");
		Util.sleep(10000);
		System.out.println("run end");
	}
}
public class M26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		V obj = new V();
		obj.start();
		Util.sleep(2000);
		obj.interrupt();
		System.out.println("main end");
	}

}
