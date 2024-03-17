package pack1;

class N implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread");
	}
}
public class M17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N obj = new N();
		Thread t1 = new Thread(obj, "my first thread");
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}

}
