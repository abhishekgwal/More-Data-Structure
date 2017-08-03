package practice;

public class StringReverseOptimalWay {
	
	char[] reverse (String str) {
		int i = 0;
		int j = str.length() - 1;
		char ch[] = str.toCharArray();
		
		while(i < j) {
			char temp;
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return ch;
	}

	public static void main(String[] args) {
		
		StringReverseOptimalWay obj = new StringReverseOptimalWay();
		char arr[] = obj.reverse("hello");
		
		String res = new String(arr);
		System.out.println(res);

	}

}
