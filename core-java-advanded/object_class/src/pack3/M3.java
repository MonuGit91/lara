package pack3;

class C{
	int i;
	C(int i){
		this.i = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (this.i == ((C)obj).i);
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		C c2 = new C(90);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.i == c2.i);
	}
}
/*
by overriding equals method be are able to compare object based on content of the object


*/