package practice;

public class FizzBuzzOtherWay {

	public void fizzBuzz(int x) {
		for (int i = 1; i < x; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
	}

	public static void main(String args[]) {
		FizzBuzzOtherWay obj = new FizzBuzzOtherWay();
		obj.fizzBuzz(31);

	}

}
