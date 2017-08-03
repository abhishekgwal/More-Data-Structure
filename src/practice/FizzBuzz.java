package practice;

// https://www.youtube.com/watch?v=c0OMPDLef08&t=1s
// Divisible by 3 - Print Fizz
// Divisible by 5 - Print Buzz
// Divisible by 15 - Print FizzBuzz
/*
 * Example: 1 2 Fizz 3 4 Buzz.......13 14 FizzBuzz 
 */
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {

		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else
				list.add(Integer.toString(i));
		}
		return list;
	}

	public static void main(String[] args) {

		FizzBuzz obj = new FizzBuzz();
		System.out.println(obj.fizzBuzz(15));

	}

}
