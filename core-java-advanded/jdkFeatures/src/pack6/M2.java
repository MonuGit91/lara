package pack6;

import java.time.LocalTime;
import java.time.Month;

public class M2 {
	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now();
		System.out.println("current time:" + currentTime);

		LocalTime midday = LocalTime.of(12, 0);
		System.out.println("midday:" + midday);

		LocalTime afterMidday = LocalTime.of(13, 30, 15);
		System.out.println("after midday:" + afterMidday);

		LocalTime fromSecondOfDay = LocalTime.ofSecondOfDay(12345);
		System.out.println("fromSecondOfDay:" + fromSecondOfDay);
	}
}