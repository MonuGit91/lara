package Q012_SprialMatrix2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static int[][] spiralOrder(int n) {
		int matrix[][] = new int[n][n];
		int rowStart = 0, rowEnd = n - 1; //rs : rowStart, re : rowEnd
		int colStart = 0, colEnd = n - 1; //cs : colStart, ce : colEnd
		int val = 1;
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				matrix[rowStart][i] = val++;
			}
			rowStart++;
			for (int i = rowStart; i <= rowEnd; i++) {
				matrix[i][colEnd] = val++;
			}
			colEnd--;
			if(rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					matrix[rowEnd][i] = val++;
				}
			}
			rowEnd--;
			if(colStart <= colEnd) {
				for (int i = rowEnd; i >= rowStart; i--) {
					matrix[i][colStart] = val++;
				}
			}
			colStart++;
		}
		return matrix;
	}
	public static void main(String[] args) {
		int matrix[][] = spiralOrder(4);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int matrix1[][] = spiralOrder(7);
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[0].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}