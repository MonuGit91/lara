package enum1;

public class A {
	enum Month{
		JAN(31), FEB(28), MAR(31);
		int days;
		Month(int days){
			this.days = days;
		}
		public int getDays() {
			return days;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month m1 = Month.FEB;
		System.out.println(m1.getDays());
	}

}
/*
 

*/