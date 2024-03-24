package pack2;

public class M11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("helotoall");
		System.out.println(sb);
		sb.delete(20, 30);//StringIndexOutOfBoundsException
		System.out.println(sb);
	}

}
