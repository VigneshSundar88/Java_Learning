package hackerRankStringsEasy;

public class ValidUsernameChecker {

	public static void main(String[] args) {
		checkName("JuliaZ007_122");
	}

	private static void checkName(String input) {
		String regexExpr = "[A-Za-z]\\w{7,29}";
		if(input.matches(regexExpr)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
