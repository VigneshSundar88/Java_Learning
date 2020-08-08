package hackerRankStringsEasy;

import java.util.Arrays;

public class StringTokens {
	
public static void main(String[] args) {
		
		String aa = "He is a very very good boy, isn't he?";
		String[] splitArray = aa.split("[ |,'?]+");
		//System.out.println(Arrays.toString(splitArray));
		
		for(int i=0;i<splitArray.length;i++) {
			if(splitArray[i].contains("?")) {
				splitArray[i] = splitArray[i].replace("?", "");
			}else if(splitArray[i].contains(",")) {
				splitArray[i] = splitArray[i].replace(",", "");
			}
		}
		System.out.println(Arrays.toString(splitArray));
		System.out.println("size: "+splitArray.length);

	}

}
