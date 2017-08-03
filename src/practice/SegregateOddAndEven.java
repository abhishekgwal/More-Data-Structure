package practice;

public class SegregateOddAndEven {

	int[] segregate(int[] array) {
		int count = 0;
		int size = array.length;
		int res[] = new int[size];

		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				res[count] = array[i];
				count++;
			}
		}
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 1)
				res[count++] = array[i];
		}
		return res;
	}

	public static void main(String[] args) {

		int res[];
		SegregateOddAndEven obj = new SegregateOddAndEven();
		int arr[] = { 2, 4, 3, 5, 6, 7, 9 };
		res = obj.segregate(arr);
		for (int i : res)
			System.out.println(i);

	}

}
