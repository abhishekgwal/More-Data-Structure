public class CheckBinaryPalindrome {

	// https://careercup.com/question?id=5725086158946304
	// 9 = 1001 - Palindrome
	// 8 = 1000 - Not Palindrome

	boolean binaryPalindrome(int x) {

		String s = Integer.toBinaryString(x);
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		CheckBinaryPalindrome obj = new CheckBinaryPalindrome();
		System.out.println("Palindrome[True]/[False] = "+ obj.binaryPalindrome(9));
		System.out.println("Palindrome[True]/[False] = "+ obj.binaryPalindrome(8));
		System.out.println("Palindrome[True]/[False] = "+ obj.binaryPalindrome(25));

	}
}
