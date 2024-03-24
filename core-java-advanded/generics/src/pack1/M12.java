package pack1;

class L<X> {
	X obj;
	X test() {
		return obj;
	}
}
public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L<Integer> l1 = new L<Integer>();
		L<String> l2 = new L<String>();
		L<Double> l3 = new L<Double>();
		
		Integer obj1 = l1.test();
		String obj2 = l2.test();
		Double obj3 = l3.test();
		System.out.println("done");
	}

}
