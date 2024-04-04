package pack2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M3 {

	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("test2.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A)in.readObject();//calling toString method internally
		System.out.println(a1);
	}

}
/*
reading object state -> deserialization purpose



*/