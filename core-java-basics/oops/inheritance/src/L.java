import java.util.*;
class K{
	K() {
		System.out.println("K()");
	}
}
class L extends K{
	L(){
		//super();
		System.out.println("L()");
	}
	public static void main(String[] args){
		L obj = new L();
	}
}
/*
K()
L()
*/