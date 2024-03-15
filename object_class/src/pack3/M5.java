package pack3;

class F{
	int i;
	
	F(int i){
		this.i = i;
	}

	@Override
	public boolean equals(Object obj) {
		F ref = (F)obj;
		return i == ref.i;
	}
	
}
public class M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F(90);
		F f2 = new F(90);
		
		A a1 = new A();
		a1.i = 90;
		
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(a1));
	}
}
