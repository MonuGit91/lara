package pack3;

import java.util.HashSet;

class B {
	int i, j;
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + " , " + j + ")";
	}
	@Override
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		return (i == ((B)obj).i) && (j == ((B)obj).j);
	}
}
public class M6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set);
	}

}
/*
 * 
 * dublicate is identified using hashCode and equals method
 * 
 * 
 * 
 * 
 */
