package pack1;

class J<X>{
	X obj;
}
public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J<Integer> j1 = new J<Integer>();
		J<String> j2 = new J<String>();
		J<Double> j3 = new J<Double>();
		
		J j4 = new J();
		j1.obj = 40;
		j2.obj = "abc";
		j3.obj = 4.5;
		j4.obj = new Object();
		System.out.println("done");
	}

}
