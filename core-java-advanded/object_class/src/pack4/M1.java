package pack4;

class A{
	int i;
	A(int i){
		this.i = i;
	}
}
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
/*
hashCode does not generates based on membervariable or it's value

hashCode is the integer representation of memory adress

*/