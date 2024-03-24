package pack1;

public class M37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aslfjsfjasfjsadas    sfsfasdfads";
//		for(int i = 0; i < s1.length(); i++) {
//			System.out.println(s1.charAt(i));
//		}
		//OR
		char[] chars = s1.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
	}

}
