package Question7;

import java.util.PriorityQueue;

public class FindSecondLargest {

	public static int findSecondLargest(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
		for (int num : nums) {
			pq.add(num);
			if (pq.size() > 2)
				pq.poll();
		}
		return pq.poll();
	}
	
	public static void main(String[] args) {
		System.out.println(findSecondLargest(new int[]{3, 4, 5, 6, 7, 8}));
	}

}
