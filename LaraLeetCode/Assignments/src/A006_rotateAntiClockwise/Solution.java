package A006_rotateAntiClockwise;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int matrix[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
			};
		int n = matrix.length;
		System.out.println("input:");
		for(int i = 0; i < n; i++) System.out.println(Arrays.toString(matrix[i]));
		rotate(matrix);
		System.out.println("outpit: ");
		for(int i = 0; i < n; i++) System.out.println(Arrays.toString(matrix[i]));
	}
	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose matrix
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
            	int temp = matrix[i][j];
            	matrix[i][j] =  matrix[j][i];
            	matrix[j][i] = temp;
            }
        }
        //Reverse each Column
        reverseColumn(matrix);
    }
	private static void reverseColumn(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n; i++) {
			int j = 0, k = n-1;
			while(j < k) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[k][i];
				matrix[k][i] = temp;
				j++;
				k--;
			}
		}
	}
}
