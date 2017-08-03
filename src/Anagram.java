import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "deal";
		char[] s1Array = str1.toCharArray();
		Arrays.sort(s1Array);
		
		String str2 = "dale";
		char[] s2Array = str2.toCharArray();
		Arrays.sort(s2Array);
		
		boolean status = Arrays.equals(s1Array, s2Array);
		System.out.println(status);
		
	}
	}
