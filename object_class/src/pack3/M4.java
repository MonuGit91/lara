package pack3;
class D{
	int j;
	int i;
	public D(int j, int i) {
		this.j = j;
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (this.i==((D)obj).i && this.j == ((D)obj).j);
	}
	
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(90, 10);
		D d2 = new D(90, 10);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.i == d2.i && d1.j == d2.j);
	}
}
