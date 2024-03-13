package pack2;

public class M3 {
	int test1() {
		try {
//			some code
		}
		catch(ArithmeticException ex) {
//			some code
		}
		catch(NullPointerException ex){
//			some code
		}
		return 10;
		
	}
	
	int test2() {
		try {
//			some code
			return 10;
		}
		catch(ArithmeticException ex) {
//			some code
		}
		catch(NullPointerException ex){
//			some code
		}
		return 20;
		
	}
	int test3() {
		try {
//			some code
		}
		catch(ArithmeticException ex) {
//			some code
			return 10;
		}
		catch(NullPointerException ex){
//			some code
		}
		return 20;
		
	}
	int test4() {
		try {
//			some code
		}
		catch(ArithmeticException ex) {
//			some code
			return 10;
		}
		catch(NullPointerException ex){
//			some code
			return 10;
		}
		return 20;
		
	}
	
	int test5() {
		try {
//			some code
		}
		catch(ArithmeticException ex) {
//			some code
		}
		catch(NullPointerException ex){
//			some code
			return 10;
		}
		return 20;
		
	}
	
//	int test6() {
//		try {
////			some code
//			return 100;
//		}
//		catch(ArithmeticException ex) {
////			some code
//			return 25;
//		}
//		catch(NullPointerException ex){
////			some code
//			return 5;
//		}
//		return 20;
//		
//	}
}

/*
 * other then ArithmeticException and NullPointerException occure then only
 * return statement will not run
 */