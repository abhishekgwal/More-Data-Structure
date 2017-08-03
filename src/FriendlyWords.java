import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FriendlyWords {
	static String[] friendlyWords(String[] input) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].length() == input[j].length()) {
					char[] target = input[i].toLowerCase().toCharArray();
					Arrays.sort(target);
					char[] check = input[j].toLowerCase().toCharArray();
					Arrays.sort(check);
					if (Arrays.equals(target, check)) {
						if (!result.toString().contains(input[i]))
							result.append(input[i] + " ");
						if (!result.toString().contains(input[j]))
							result.append(input[j] + " ");
					}

				}

			}
			result.append("\n");
		}
		String answer = result.toString().replaceAll("\n+", "\n");
		String[] output = answer.split("\n");

		return output;
	}

	   public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        String[] a = null;

	        try {
	            a = in.nextLine().split(" ");
	        } catch (Exception e) {

	        }
	        
	        try {
	            for (String words : friendlyWords(a)) {
	                System.out.println(words);
	            }
	        } catch (Exception e) {
	            System.out.println("Unhandled exception!");
	        }
	    }
	}