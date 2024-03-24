package pack4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//string regular expression
public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "Hello and Hello and Hello Again and Again";
		String regex = "and";
		Pattern pattern = Pattern.compile(regex);
		Matcher matches = pattern.matcher(src);
		while(matches.find()) {
			System.out.println(matches.start() + " : " + matches.group());
		}
	}

}
/*




*/