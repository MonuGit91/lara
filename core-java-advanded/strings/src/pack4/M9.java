package pack4;

import java.util.Calendar;
import java.util.Date;

public class M9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca1 = Calendar.getInstance();
//		ca1.add(Calendar.DATE, 20);
//		ca1.add(Calendar.MONTH, -5);
		ca1.add(Calendar.YEAR, 10);
		
		Date date = ca1.getTime();
		System.out.println(date);
		
	}

}
