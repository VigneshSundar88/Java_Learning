package hackerRankStringsEasy;

public class SubString {

	public static String subStringIt(String input, int start, int end) {
		return input.substring(start, end);
	}

	public static void main(String[] args) {
		System.out.println(subStringIt("Helloworld", 3, 7));
	}

}
