package pack2;

public class M1 {
	int test1() {
		return 10;
	}

	int test2(boolean flag) {
		return 10;
	}

	int test3(boolean flag) {
		if (flag) {
			return 10;
		}
		return 20;
	}

	int test4(boolean flag) {
		if (flag) {
			return 10;
		} else {
			return 20;
		}
	}
//	int test5(boolean flag) {
//		if(flag) {
//			
//		}
//		else {
//			return 20;
//		}
//	}

//	int test6(boolean flag) {
//		if (flag) {
//			return 20;
//		} else {
//
//		}
//	}

	int test7(boolean flag) {
		if (flag) {
			return 20;
		} else {

		}
		return 10;
	}
	
	int test8(boolean flag) {
		if (flag) {
			
		} else {
			return 20;
		}
		return 10;
	}
	
//	int test9(boolean flag) { // important
//		if (flag) {
//			return 5;
//		} else {
//			return 20;
//		}
//		return 10;//unreachable
//	}
	
}
