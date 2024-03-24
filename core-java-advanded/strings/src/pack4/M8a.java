package pack4;

import java.util.Calendar;
import java.util.Date;

public class M8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date();
		
//		Date date = new Date(0);//0 base date for all software // Thu Jan 01 05:30:00 IST 1970
//		Date date = new Date(1000*60*60*24); //Fri Jan 02 05:30:00 IST 1970
//		Date date = new Date(-1000*60*60*24); //Wed Dec 31 05:30:00 IST 1969
		
		Calendar ca1 = Calendar.getInstance();
		Date date = ca1.getTime();//easiest and best way of getting date
		System.out.println(date);
	}

}
