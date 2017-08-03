
public class Matrix {

	public static void main(String[] args) {
		
		int k = 0;
		int[] elements = {4, 5, 7, 1, 8, 2, 6, 9, 3};
		int[][] matrix= new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] =elements[k];
				k++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0 ; j < 3; j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
