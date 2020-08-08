package hackerRankStringsEasy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubStringsComparisonsITER {

	public static void subStringCompare(String a, int num) {//input: "welcometojava"
		List<String> subStrings = new ArrayList<>();
		for(int i=0;i<a.length();i++) {
			if(i<=a.length()-num) {
				subStrings.add(a.substring(i, i+num));
			}else {
				break;
			}
		}
		
		Iterator<String> iter = subStrings.iterator();
		
		String theString = subStrings.get(0);
		smallestSub(iter, theString);

		theString = subStrings.get(0);
		greatestSub(iter, theString);
		
	}
	
	//to find the smallest substring using iterator
	private static void smallestSub(Iterator<String> iter, String theString) {
		while(iter.hasNext()) {
			String elem = iter.next();
			if(elem.compareTo(theString) < 0) {
				//System.out.println("***smaller***");
				theString = elem;
			}else {
				//System.out.println("***greater***");
			}
			/*System.out.println("current smallest: "+theString);
			System.out.println("  ");*/
		}
		System.out.println("smallest: "+theString);
		//System.out.println("///////////////");
	}

	//to find the greatest substring using iterator
	private static void greatestSub(Iterator<String> iter, String theString) {
		while(iter.hasNext()) {
			String elem = iter.next();
			if(elem.compareTo(theString) > 0) {
				//System.out.println("***greater***");
				theString = elem;
			}else {
				//System.out.println("***smaller***");
			}
			/*System.out.println("current greatest: "+theString);
			System.out.println("  ");*/
		}
		System.out.println("greatest: "+theString);
		//System.out.println("///////////////");
	}
	

	public static void main(String[] args) {
		subStringCompare("welcometojava", 3);
	}

}
