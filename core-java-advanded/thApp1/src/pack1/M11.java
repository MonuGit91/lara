package pack1;

public class M11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("intiater");//can provide any name
		System.out.println(t1.getName());
		
	}

}
