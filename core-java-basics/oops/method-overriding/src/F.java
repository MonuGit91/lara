class X{

}
class Y extends X{

}
class Z extends Y{

}
class A{
	X test() {
		System.out.println("A.test");
		return null;
	}
}
class F extends A{
	X test(){//here X can be replace with Y, Z, A 
		System.out.println("F.test");
		return null;
	}
	public static void  main (String[] a) {
		System.out.println("F.test");
	}
}
/*

*/