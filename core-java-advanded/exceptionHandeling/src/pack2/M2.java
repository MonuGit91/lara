package pack2;

public class M2 {
	int test1() {
		try {

		} catch (ArithmeticException ex) {

		}
		return 10;
	}

	int test2() {
		try {
			return 20;
		} catch (ArithmeticException ex) {

		}
		return 10;
	}

	int test3() {
		try {

		} catch (ArithmeticException ex) {
			return 20;
		}
		return 10;
	}

	int test4() {
		try {
			return 10;
		} catch (ArithmeticException ex) {
			return 20;
		}
	}
//	int test5(){
//		try {
	// some statement
//			return 10;
//		}
//		catch(ArithmeticException ex) {
//		}
//	}

//	int test6() {
//		try {
//			// some statement
//
//		} catch (ArithmeticException ex) {
//			// some statement
//			return 10;
//		}
//	}
	
//	int test7() {
//		try {
//			// some statement
//			return 10;
//
//		} catch (ArithmeticException ex) {
//			// some statement
//			return 10;
//		}
//		return 10;//UNREACHABLE
//	}
}
/*
 * 1. here if we get any other exception other then ArithmeticException then
 * flow will not reach to return statement 2. if no exception in try block and
 * flow reached to return of try block then last return will not work
 * 
 */