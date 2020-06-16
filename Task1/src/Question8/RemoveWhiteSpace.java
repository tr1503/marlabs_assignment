package Question8;

public class RemoveWhiteSpace {
	public static String removeWhiteSpace(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("I have the Master's of Information Sceince degree"));
	}
}
