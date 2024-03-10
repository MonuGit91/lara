import java.util.*;

class X{
	public static void main(String[] args){
		System.out.println("main begin");
		for(int i = 1, j = 20; i <= 20 || j <= 60; i++, j+=3) {
			System.out.println("loop body: " + i + " , " + j);
		}
	}
}
