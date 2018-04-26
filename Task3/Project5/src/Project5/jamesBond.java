package Project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jamesBond {
public Boolean bondRegex(String input) {
		
		Pattern p = Pattern.compile("([^\\(]\\s).*\\(\\s([^0]\\s).*(0\\s){2}7\\s([^\\)])");
				//".*[\\(].*(0{2})[7].*[\\)]");
		Matcher m = p.matcher(input);
		return m.find();
		
	}
}
