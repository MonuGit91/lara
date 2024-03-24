package pack4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String src = "java@java.com";
				String regex = ".";
				Pattern pattern = Pattern.compile(regex);
				Matcher matches = pattern.matcher(src);
				System.out.println(matches.find());
	}

}
