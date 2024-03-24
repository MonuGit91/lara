package pack4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//***
public class M4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "java8,java10,      java11,     java12,        oracle18";
//		String regex = "\\s+";
		String regex = "\\d";//print all degits and it's location
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while(matches.find()) {
			System.out.println(matches.start() + " : " + matches.group());
		}
	}

}
