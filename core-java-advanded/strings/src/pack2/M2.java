package pack2;

//***
public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");
		
		System.out.println(sb1==sb2);//False
		System.out.println(sb1.equals(sb2));//False
	}

}
/*
 * so equals int overrided 
 * 
 * 
 */
