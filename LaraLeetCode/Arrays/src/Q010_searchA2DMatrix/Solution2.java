package Q010_searchA2DMatrix;

import java.util.Arrays;

public class Solution2 {
	public static boolean searchMatrix(int[][] matrix, int target) {
        int index = Arrays.binarySearch(matrix[0], 31);
        System.out.println(index);
        
        return false;
    }
}
