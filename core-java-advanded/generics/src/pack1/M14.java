package pack1;

class N<Test>{
	N(Test obj){
		
	}
}
public class M14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N<String> n1 = new N<String>("abc");
		N<Integer> n2 = new N<Integer>(90);
		N<Double> n3 = new N<Double>(4.5);
		System.out.println("done");
	}

}
