package pack6;

import java.time.LocalDate;
import java.time.Month;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("current date:" + currentDate);
		// 2014-02-10
		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		System.out.println("tenthFEB2014:" + tenthFeb2014);
		// month values start at 1 (2014-08-01)
		LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
		System.out.println("firstAug2014:" + firstAug2014);
		// the 65th days of 2010 (2010-03-06)
		LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
		System.out.println("sixtyFifthDayOf2010:" + sixtyFifthDayOf2010);
	}

}
