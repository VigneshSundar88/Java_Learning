package hackerRankStringsEasy;

import java.util.ArrayList;
import java.util.List;

public class SubStringsComparisons {

	public static void subStringCompare(String a, int num) {//input: "welcometojava"
		List<String> subStrings = new ArrayList<>();
		for(int i=0;i<a.length();i++) {
			if(i<=a.length()-num) {
				subStrings.add(a.substring(i, i+num));
			}else {
				break;
			}
		}
		
		String theString = subStrings.get(0);
		smallestSub(subStrings, theString);

		theString = subStrings.get(0);
		greatestSub(subStrings, theString);

	}
	
	//to find the smallest substring
	private static void smallestSub(List<String> subStrings, String theString) {
		for(int i=0;i<subStrings.size();i++) {
			System.out.println("aa.get(i): "+subStrings.get(i));
			System.out.println("smallest: "+theString);
			if(subStrings.get(i).compareTo(theString) < 0) {
				System.out.println("***smaller***");
				theString = subStrings.get(i);
			}else {
				System.out.println("***greater***");
			}
			System.out.println("current smallest: "+theString);
			System.out.println("  ");
		}
		System.out.println("smallest: "+theString);
	}

	//to find the greatest substring
	private static void greatestSub(List<String> subStrings, String theString) {
		for(int i=0;i<subStrings.size();i++) {
			/*System.out.println("aa.get(i): "+subStrings.get(i));
			System.out.println("theString: "+theString);*/
			if(subStrings.get(i).compareTo(theString) > 0) {
				//System.out.println("***greater***");
				theString = subStrings.get(i);
			}else {
				//System.out.println("***smaller***");
			}
			/*System.out.println("current greatest: "+theString);
			System.out.println("  ");*/
		}
		System.out.println("greatest: "+theString);
	}
	

	public static void main(String[] args) {
		subStringCompare("welcometojava", 4);
	}

}
