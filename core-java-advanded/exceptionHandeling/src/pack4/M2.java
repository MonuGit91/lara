package pack4;

public class M2 {
	public static void main(String[] args) {
//		Class.forName("");
		try {
			Class.forName("");
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
/*
 * for calling clone method we can not call it directly because it comes under
 * checkedException
 * 
 */