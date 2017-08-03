package practice;
// Recursive way to reverse string
public class StringReverseRecursive {
	
	public String reverse(String str) {
		if (str.length() == 1) {
	           return str;
	       }
	    return reverse(str.substring(1)) + str.charAt(0);
	    }

	public static void main(String[] args) {

		StringReverseRecursive obj = new StringReverseRecursive();
		System.out.println(obj.reverse("hello world"));
		
	}

}
