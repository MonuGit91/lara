package pack1;

class M extends Thread{
	M(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread");
	}
}
public class M16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m1 = new M("my first thread");
		m1.start();
		System.out.println(m1.getName());
		m1.setName("first child");
		System.out.println(m1.getName());
	}

}
