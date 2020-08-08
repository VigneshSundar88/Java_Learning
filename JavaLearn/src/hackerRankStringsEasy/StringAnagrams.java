package hackerRankStringsEasy;

import java.util.HashMap;
import java.util.Map;

public class StringAnagrams {

	public static void main(String[] args) {
		if(toAnalyze("AnagRam").equals(toAnalyze("MarGana"))) {
			System.out.println("The given Strings are ANAGRAMS");
		}else {
			System.out.println("The given Strings are NOT Anagrams");
		}

	}

	public static HashMap<Character, Integer> toAnalyze(String aa) {
		HashMap<Character, Integer> toCount = new HashMap<Character, Integer>();
		char[] strArray = aa.toCharArray(); 
		for(char mm : strArray) {
			if(toCount.containsKey(Character.toLowerCase(mm))) {
				toCount.put(Character.toLowerCase(mm), toCount.get(mm)+1);
			}else {
				toCount.put(Character.toLowerCase(mm), 1);
			}
		}
		//System.out.println(toCount);
		return toCount;
	}

}
