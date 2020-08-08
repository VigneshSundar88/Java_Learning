package hackerRankStringsEasy;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		
		//checkPattern("([A-Z])(.+)");
		checkPattern("[AZ[a-z](a-z)");
		//checkPattern("batcatpat(nat");

	}

	private static void checkPattern(String aa) {
		try {
			Pattern pattern = Pattern.compile(aa, Pattern.CASE_INSENSITIVE);
			System.out.println("fetched input pattern: "+pattern+" is Valid");
		}catch(PatternSyntaxException e) {
			System.out.println("Invalid");
		}
	}

}
