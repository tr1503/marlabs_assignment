package Question6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateChar {

	public static List<Character> findDuplicate(String s) {
		Map<Character, Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				list.add(entry.getKey());
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Character> list = findDuplicate("kkeeffj");
		for (char c : list) {
			System.out.println(c);
		}
	}

}
