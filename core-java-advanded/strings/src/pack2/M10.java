package pack2;

public class M10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("helotoall");
		System.out.println(sb);
		sb.delete(2, 30);//here 30th index is not there so delete upto last index
		System.out.println(sb);
	}
}
