public class StringDecompression {

	public StringBuilder decompress(String s) {
		int tempInt = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				tempInt = Character.getNumericValue(s.charAt(i));

			} else if (Character.isLetter(s.charAt(i))) {
				char tempChar = s.charAt(i);
				sb.append(tempChar);
				while (tempInt > 1) {
					sb.append(tempChar);
					tempInt--;
				}

			}
		}
		return sb;
	}

	public static void main(String[] args) {

		StringDecompression obj = new StringDecompression();
		System.out.println(obj.decompress("3b2a"));
		System.out.println(obj.decompress("3b2a5c1dggf3s"));
		System.out.println(obj.decompress("aaa2b1c4d5fzz3z"));
	}

}
