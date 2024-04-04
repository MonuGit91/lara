package pack6;

import java.time.LocalTime;

public class M4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.of(15, 30);
		int hour = time.getHour();
		int second = time.getSecond();
		int minute = time.getMinute();
		int secondOfDay = time.toSecondOfDay();
	}
}
