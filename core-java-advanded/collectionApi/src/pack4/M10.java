package pack4;

import java.util.Hashtable;

//***
public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable table = new Hashtable();
		table.put("abc", 3443);
		table.put(null, true);//NullPointerException
		table.put(3.4, true);
		table.put("abc2", 'a');
		table.put(true, 4.5);
		System.out.println(table);
	}

}

/*
Hashtable not allows null for key and value
*/