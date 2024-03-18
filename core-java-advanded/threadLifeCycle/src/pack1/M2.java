package pack1;

class A extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		A a1 = a1 = new A();
		System.out.println("a: " + a1.getState());
		a1.start();
		System.out.println("b: " + a1.getState());
		Thread.sleep(4);
		System.out.println("c: " + a1.getState());
		Thread.sleep(10000);
		System.out.println("d: " + a1.getState());
	}

}
