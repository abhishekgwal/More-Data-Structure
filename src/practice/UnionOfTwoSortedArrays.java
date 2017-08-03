package practice;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {

		int a[] = {1, 3, 4, 5, 7 };
		int b[] = { 2, 3, 5, 6, 9 };
		int i = 0, j = 0, len1 = a.length, len2 = b.length;

		while (i < len1 && j < len2) {
			if (a[i] < b[j]) {
				
				System.out.print(a[i] + " , ");
				i++;
			}

			else if (a[i] > b[j]) {
				System.out.print(b[j] + " , ");
				j++;
			} else {
				System.out.print(a[i] + " , ");
				i++;
				j++;
			}
		}
		while (i < len1) {
			System.out.println(a[i] + " , ");
			i++;
		}
		while (j < len2) {
			System.out.print(b[j] + " , ");
			j++;
		}

	}

}
