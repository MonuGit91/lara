package Q010_searchA2DMatrix;

import java.util.Arrays;

public class Solution {
	public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < n; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][m-1]) {
//            	return Arrays.binarySearch(matrix[i], target) >= 0;
            	for(int j = 0; j < matrix[i].length; j++) {
            		if(target == matrix[i][j]) {
            			System.out.println(target);
            			return true;
            		}
            	}
            }
        }
        return false;
    }
}
