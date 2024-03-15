package pack3;

class H{
	int i, j, k;

	public H(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (obj instanceof H) && (i == ((H)obj).i) && (j == ((H)obj).j) && (k == ((H)obj).k);
	}
}
public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H h1 = new H(10, 20, 30);
		H h2 = new H(10, 20, 30);
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(10));
		System.out.println(h1.equals(new H(10, 20, 30)));
		System.out.println(h1.equals(new H(10, 20, 31)));
		System.out.println(h1.equals("hello"));
		
	}

}
