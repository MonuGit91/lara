package pack3;

import java.util.HashSet;

class D {
	int i;
	D(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(" + i + ")";
	}
}
public class M8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1 = new D(90);
		D d2 = new D(90);
		HashSet set = new HashSet();
		set.add(d1);
		set.add(d2);
		System.out.println(set);
	}

}
