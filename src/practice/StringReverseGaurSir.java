package practice;

public class StringReverseGaurSir {

	public String reverse(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++)
			str2 = str.charAt(i) + str2;
		return str2;

	}

	public static void main(String[] args) {

		StringReverseGaurSir obj = new StringReverseGaurSir();
		System.out.println(obj.reverse("hello world"));

	}

}
