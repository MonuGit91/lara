package pack2;

public class M4 {
	int test1() {
		try {
//			some statements
		}
		catch(ArithmeticException ex) {
//			some statements
		}
		finally {
//			some statements	
		}
		return 10;
	}
	
	int test2() {
		try {
//			some statements
			return 20;
		}
		catch(ArithmeticException ex) {
//			some statements
		}
		finally {
//			some statements	
		}
		return 10;
	}

	int test3() {
		try {
//			some statements
		}
		catch(ArithmeticException ex) {
//			some statements
			return 20;
		}
		finally {
//			some statements	
		}
		return 10;
	}
	
	int test4() {
		try {
//			some statements
		}
		catch(ArithmeticException ex) {
//			some statements
		}
		finally {
//			some statements	
			return 10;
		}
		
	}
	
//	int test5() {
//		try {
////			some statements
//		}
//		catch(ArithmeticException ex) {
////			some statements
//		}
//		finally {
////			some statements	
//			return 10;
//		}
//		return 20;//unreachable
//	}
//		

}
