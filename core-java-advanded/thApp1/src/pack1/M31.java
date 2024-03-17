package pack1;

class Z extends Thread{
	Z(){
		start();
	}
	public void run() {
		System.out.println("run begin");
		start();
		System.out.println("run end");
	}
}
public class M31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		Z obj = new Z();
		System.out.println(2);
	}

}
