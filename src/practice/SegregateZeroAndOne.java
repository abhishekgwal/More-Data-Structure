package practice;

public class SegregateZeroAndOne {

	int[] result(int a[]) {

		int len = a.length;
		int res[] = new int[len];
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (a[i] == 0)
				count++; // 4
		}

		for (int i = 0; i < len; i++) {

			if (count != 0) {
				res[i] = 0;
				count = count - 1;
			} else {
				res[i] = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		SegregateZeroAndOne obj = new SegregateZeroAndOne();
		int array[] = {0, 0, 1, 0, 1, 1, 0, 1};
		int result[] = obj.result(array);
		for(int i: result)
			System.out.print(i+ ", ");
		
		
	}

}
