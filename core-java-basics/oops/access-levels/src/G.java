import java.util.*;
class A{
	private A(){
		System.out.println("A()");
	}
}
class G extends A{
	public static void main(String[] args){
		System.out.println("HelloWorld");

	}
}
