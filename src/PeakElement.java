public class PeakElement {

	// https://www.youtube.com/watch?v=a7D77DdhlFc

	Integer peak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1]))
				return arr[mid] ;

			if (mid > 0 && arr[mid - 1] > arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return null;
		

	}

	public static void main(String[] args) {

		PeakElement obj = new PeakElement();
		int array[] = { 9, 7,5,4,2 };
		Integer res = obj.peak(array);
		System.out.println("Peak Element = " + res);

	}

}
