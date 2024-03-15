package default_package;

enum G{
	CON1, CON2, CON3, CON4
}
public class H {
	public static void main(String[] args) {
		G g1 = G.CON1;
		G g2 = G.CON4;
		System.out.println(g1);
		System.out.println(g2);
	}
}
/*
if enum contains only constant then ";" is optional
*/