package pack1;

public class M5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] elements = new boolean[3];
		System.out.println(elements[0] + ", " + elements[1] + ", " + elements[2]);
		elements[0] = true;
		elements[1] = elements[0];
		elements[2] = !elements[0];
		System.out.println("@step2:"+elements[0]+", "+elements[1]+", " + elements[2]);
	}
}
