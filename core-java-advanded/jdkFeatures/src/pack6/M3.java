package pack6;

import java.time.LocalDateTime;
import java.time.Month;

public class M3 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("currentDateTime:" + currentDateTime);

		LocalDateTime secondsAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
		System.out.println("secondsAug2014:" + secondsAug2014);

		LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);
		System.out.println("christmas2014:" + christmas2014);
	}
}