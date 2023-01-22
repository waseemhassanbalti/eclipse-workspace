package week6Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task1 {
	
	public static void main(String[] args) {
		String str = "aasdawawgeeiplkkua";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				int value = map.get(str.charAt(i));
				map.put(str.charAt(i), value+1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if(val==1)
			System.out.print(key+" ");
			
		}
		
		
		HashSet<Character> strMap = new HashSet();
		HashSet<Character> onceOuccurenceMap = new HashSet();

		for(int i = 0; i<str.length(); i++) {
			
			if(!strMap.add(str.charAt(i))) {
				onceOuccurenceMap.remove(str.charAt(i));
			}else {
				onceOuccurenceMap.add(str.charAt(i));
			}
		}
		
		System.out.println("\n"+onceOuccurenceMap);
	}

}
