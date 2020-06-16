package Question5;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		for (int num : list) {
			System.out.println(num);
		}
	}

}
