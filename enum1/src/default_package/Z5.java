package default_package;

public class Z5 {
	enum X{
		A, B, C, D;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1 = X.C;
		switch(x1) { //here x1 is enum type so every case must be enum constant type
			case A: {
				System.out.println("in A");
				break;
			}
			case B: {
				System.out.println("in B");
				break;
			}
			case C: {
				System.out.println("in C");
				break;
			}
			case D: {
				System.out.println("in D");
				break;
			}
		}
	}

}
