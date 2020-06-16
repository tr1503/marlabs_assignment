package Question9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissing {
	public static List<Integer> findMissing(int[] nums) {
		List<Integer> res = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(i))
				res.add(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		List<Integer> missing = findMissing(new int[]{0, 1, 3, 3, 5, 5, 6});
		for (int num : missing) {
			System.out.println(num);
		}
	}

}
