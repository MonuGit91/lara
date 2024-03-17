package pack1;
class K extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread");
	}
}
public class M14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K k1 = new K();
		k1.start();
		System.out.println(k1.getName());
		k1.setName("first child");
		System.out.println(k1.getName());

	}

}
