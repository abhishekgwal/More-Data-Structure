package com.trees.practice;

public class MatrixPractice {
	
	 public void print2D(int mat[][]) 
	    { 
	        // Loop through all rows 
	        for (int i = 0; i < mat.length; i++) 
	  
	            // Loop through all elements of current row 
	            for (int j = 0; j < mat[i].length; j++) 
	                System.out.print(mat[i][j] + " "); 
	    } 

	public static void main(String[] args) {
		
		MatrixPractice obj = new MatrixPractice();
		
		int mat[][] = { { 1, 2, 3, 4, 5, 6, 7 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12, 13 } }; 
		
		int row[] = new int[mat.length];
		int column[] = new int[mat[0].length];
		
		System.out.println("Rows = ");
		
		for (int i = 0; i < row.length; i++)
			System.out.print(i + " ");
		
		System.out.println();
		System.out.print("Columns = ");
		for (int j = 0; j < column.length; j++)
			System.out.print(j + " ");
		System.out.println();
		
		obj.print2D(mat); 

	}

}
