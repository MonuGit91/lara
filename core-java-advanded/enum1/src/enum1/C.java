package enum1;

import java.util.EnumSet;
enum B{
	abc, xyz, test;
}

public class C {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<B> set = EnumSet.of(B.abc, B.xyz, B.test);
		
		for(B b1 : set) {
			System.out.println(b1);
		}
	}

}
/*
EnumSet:- it is used making group of fue constant of same enum or all constant of same enum

*/