package testOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearn {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vicky", 16);
		map.put("KK", 22);
		map.put("YY", 33);
		map.put("Vicky", 20);
		
		//System.out.println(map);
		
		
		Set<Entry<String, Integer>> mpE = map.entrySet();
		for(Entry<String, Integer> kk: mpE) {
			System.out.println(kk.getKey());
			System.out.println(kk.getValue());
		}

	}

}
