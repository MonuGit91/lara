package pack1;

public class M12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try {
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		System.out.println("main end");
	}

}
/*
try generally contains abnormal statements that can give some exception of error object
immediately after try block catch block should be there
catch block's argument should be exception type or Error type
handeling exception object is nothing but assigning a refrence varaible that can be done through catch

by trycatch we can not guarentee every stataement will run in try block but we can guarentee the flow will reach to the end


*/