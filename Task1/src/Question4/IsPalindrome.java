package Question4;

public class IsPalindrome {

	public static boolean numberPalindrome(int num) {
		int reverse = 0;
		int origin = num;
		while (num != 0) {
			reverse = reverse * 10;
			reverse += num % 10;
			num /= 10;
		}
		return origin == reverse;
	}
	
	public static boolean stringPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		char[] arr = s.toCharArray();
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr).equals(s);
	}
	public static void main(String[] args) {
		System.out.println(numberPalindrome(101));
		System.out.println(stringPalindrome("aba"));
	}

}
