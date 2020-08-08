package hackerRankStringsEasy;

public class StringReverse {
	
	static boolean result = false;
	
	public static boolean stringReverse(String inp) {
		char[] charArray = inp.toCharArray();
		//System.out.println("charArray: "+Arrays.toString(charArray));
		String reversed = "";
		int size = charArray.length;
		for(int j=size-1;j>=0;j--) {
			reversed += String.valueOf(charArray[j]);
		}
		if(reversed.equalsIgnoreCase(inp)) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		if(stringReverse("madam")) {
			System.out.println("Yes it's a Palindrome");
		}else {
			System.out.println("Nope it's NOT a Palindrome");
		}
	}

}
