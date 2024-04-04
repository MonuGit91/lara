package pack2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{//marker interface
	int i;
	A(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M2 {
	public static void main(String[] args) throws Exception{
		A a1 = new A(90);
		FileOutputStream fout = new FileOutputStream("test2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		System.out.println("done");
		
	}
}
/*
Serialization means writing object state into persistant media
writing object state-> is serilization purposw
ie, for writing -> we use serilization

here we are trying to write object state into file
-for serialization we required ObjectOutputStream and it should be on top of a FileOutputStream.
*/
