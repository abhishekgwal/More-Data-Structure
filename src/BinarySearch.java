public class BinarySearch {

	public int binarySearch(int[] a, int n, int x) {
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (a[mid] == x)
				return mid;

			else if (x < a[mid])
				end = mid - 1;
			else
				start = mid + 1;

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 2, 6, 13, 21, 36, 47, 63, 81, 97 };

		BinarySearch obj = new BinarySearch();
		System.out.println("Located at index - "
				+ obj.binarySearch(array, array.length, 97));

	}

}
