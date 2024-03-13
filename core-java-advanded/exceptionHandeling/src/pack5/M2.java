package pack5;

public class M2 {
	public static void main(String[] args) {
		try {
			test();
		}
		catch(ClassNotFoundException ex) {
			
		}
		
	}

	static void test() throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("");
	}
}
