package pack3;

import java.util.HashSet;

class C {
	int i, j, k;
	C(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + " , " + j + " , " + k + ")";
	}
	@Override
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		return (i == ((C)obj).i) && (j == ((C)obj).j) && (k == ((C)obj).k);
	}
}
public class M7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set.add(new C(90, 10, 1)));
		System.out.println(set);
	}

}