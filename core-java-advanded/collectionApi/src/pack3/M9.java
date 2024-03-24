package pack3;


import java.util.HashSet;

class E {
	int i;
	E(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(" + i + ")";
	}
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
		System.out.println("hashCode for " + this + " is " + hash);
		return hash;
	}
	public boolean equals(Object obj) {
		boolean b1 =  (i == ((E)obj).i);
		System.out.println("equals b/w "+this + "and " + obj + "is " + b1);
		return b1;
	}
}
public class M9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e1 = new E(90);
		E e2 = new E(90);
		HashSet set = new HashSet();
		set.add(e1);
		set.add(e2);
		System.out.println(set);
	}

}
