package pack1;

public class M22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}

}
/*
-sleep is a static() it take no of mili seconds
-it gives checked exception



*/