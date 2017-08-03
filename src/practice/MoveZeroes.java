package practice;

public class MoveZeroes {

	public int[] moveZero(int[] array) {

		int c = 0, k = 0;
		int[] array_copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				c = c + 1;
			else {
				array_copy[k] = array[i];
				k = k + 1;
			}
		}
		return array_copy;

	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 0, 3, 12 };
		MoveZeroes obj = new MoveZeroes();
		int res[] = obj.moveZero(a);

		for (int i : res)
			System.out.println(i);

	}

}
