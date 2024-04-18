package Q015_rotate90degree;

import java.util.Arrays;

public class Solution {
	private static void swap(int mat[][], int i, int j) {
		if(mat[i][j] == mat[j][i]) return;

        mat[i][j] = mat[i][j]^mat[j][i];
        mat[j][i] = mat[i][j]^mat[j][i];
        mat[i][j] = mat[i][j]^mat[j][i];
	}
	public static void main(String[] args) {
		int matrix[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
			};
		int n = matrix.length;
		rotate(matrix);
		for(int i = 0; i < n; i++) System.out.println(Arrays.toString(matrix[i]));
		
	}
	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose matrix
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
            	swap(matrix, i, j);
            }
        }
        //Reverse each row
        for(int[] arr : matrix){
        	reverse(arr);
        }
    }
	private static void reverse(int[] arr) {
		int i = 0, j = arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
	}
}
