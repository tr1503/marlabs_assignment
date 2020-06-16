package Question2;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static HashMap<String, Integer> countWords(String s) {
		HashMap<String, Integer> counter = new HashMap<>();
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			counter.put(words[i], counter.getOrDefault(words[i], 0) + 1);
		}
		return counter;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> counter = countWords("Time is money time is Money");
		for (Map.Entry<String, Integer> entry : counter.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
