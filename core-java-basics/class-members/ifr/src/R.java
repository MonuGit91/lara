import java.util.*;
class A1{
	static void test1() {
		System.out.println("from A.test1");
	}
}
class B1{
    static void test2() {
        System.out.println("from B.test1");
    }
}
class R{
	public static void main(String[] args) {
		System.out.println("main begin");
		A1.test1();
		System.out.println("---------");
		B1.test2();
		System.out.println("---------");
		System.out.println("main end");
	}
}
/*
- we can save the java file using any class name present in file
- but for running main() you should save the file name same as class holding main()
- if any public class is present then only we have to choose then name as public class name
 
L:-
- we can use write before initilizing but read operation is not possible
*/
