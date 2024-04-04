package pack1;

abstract class J{
	int i;
	J(int i){
		this.i = i;
	}
	void test() {
		System.out.println("from test: " + i);
	}
}
class K extends J{
	K(int i){
		super(i);
	}
}
public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K k1 = new K(90);
		K k2 = new K(190);
		
	}

}
