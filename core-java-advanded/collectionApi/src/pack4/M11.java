package pack4;

import java.util.Hashtable;

//***
public class M11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();
		table.put("abc", 3443);
		table.put(56 , true);
		table.put(3.4, true);
		table.put("abc2", 'a');
		table.put(true, null);//NullPointerException
		System.out.println(table);
	}
}
/*
Hashtable not allows null for key and value
*/