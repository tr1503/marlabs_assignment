package Question10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MostRepeatedWord {
	public static void main(String[] args) {
		File file = new File("test.txt");
		Map<String, Integer> map = new HashMap<>();
		if (!file.canRead()) {
            System.err.println("Error: The file cannot be read");
            System.exit(1);
        }
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException ex) {
			System.err.println("Error: The file cannot be opened");
            System.exit(1);
		}
		scanner.useDelimiter("\n");
        scanner.useDelimiter("((\\s+[\\-_']+))|([\\-_']\\s+)|(\\s*[^a-zA-Z\\-_']\\s*)|[\\-_']{2,}|([\\s]+)|([^a-zA-Z\\-_']\\s*)");
        while (scanner.hasNext()) {
        	String word = scanner.next();
        	if (word != null && !word.equals("") && word != "" && word.length() != 0) {
        		map.put(word, map.getOrDefault(word, 0) + 1);
        	}
        }
        scanner.close();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
        		(a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	pq.offer(entry);
        	if (pq.size() > 1)
        		pq.poll();
        }
        System.out.println(pq.poll().getKey());
	}
}
