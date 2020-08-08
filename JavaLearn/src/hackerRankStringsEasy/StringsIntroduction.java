package hackerRankStringsEasy;

public class StringsIntroduction {

	public static void stringIntro(String a, String b) {
		int lengthOfa = a.length();
		int lengthOfb = b.length();
		int totalLength = lengthOfa+lengthOfb;
		System.out.println("The total length of the Strings is: "+totalLength);

		if(a.compareTo(b) > 0) {	
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		char aa = a.charAt(0);
		char bb = b.charAt(0);

		String aModif = Character.toUpperCase(aa) + a.substring(1); 
		String bModif = Character.toUpperCase(bb) + b.substring(1);
		//1st way-basic
		System.out.println(aModif+" "+bModif);
		//2nd way-better
		System.out.println(String.join(" ", aModif, bModif));
	}


	public static void main(String[] args) {
		stringIntro("hello", "java");
	}

}
