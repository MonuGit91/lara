package default_package;

public class O {
	public static void main(String[] args) {
		Month t1 = Month.JAN;
		Month t2 = Month.DEC;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i = Month.FEB.ordinal();//constant assigned to enum
		System.out.println(i);
	}
}
