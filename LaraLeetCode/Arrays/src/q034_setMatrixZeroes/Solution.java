package q034_setMatrixZeroes;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int mat[][] = {{1,1,1},{1,0,1},{1,1,1}};
		sol.setZeroes(mat);
		for(int arr[] : mat) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		mat = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		sol.setZeroes(mat);
		for(int arr[] : mat) {
			System.out.println(Arrays.toString(arr));
		}
	}

	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int row[] = new int[m];
		int col[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}

}
