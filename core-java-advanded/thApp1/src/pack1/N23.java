package pack1;

public class N23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000, 500);//sleep(mili secont, nano second);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}

}
