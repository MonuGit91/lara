package pack1;

public class Util {

	public static void sleep(long millis) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
