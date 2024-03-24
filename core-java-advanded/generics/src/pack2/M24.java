package pack2;

class I <X>{
	X obj;
}
public class M24 {
	public static void main(String[] args) {
		I<? extends Number> i1 = null;
		i1 = new I<Number>();
		i1 = new I<Integer>();
		i1 = new I<Byte>();
		System.out.println("done");
	}
}
