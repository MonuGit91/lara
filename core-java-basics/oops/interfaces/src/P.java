import java.util.*;

interface A{
	void test1();
}
class P implements A{
	public void test1(){
		System.out.println("p-test1");
	}
	public static void main(String[] args){
		P obj = new P();
		obj.test1();
		System.out.println("done");

	}
}
/*
now it will compile successfully

*/
