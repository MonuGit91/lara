package pack1;

class W extends Thread{
	public void run() {
		System.out.println("run begin");
		int i = 10/0;
		System.out.println("run end");
	}
}
public class M28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		W obj = new W();
		obj.start();
		System.out.println(2);
	}

}
