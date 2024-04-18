package A005_spiralAntiClockwise;

import java.util.*;
public class Solution {
	public static void spiralAnticlockWise(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int rowStart = 0;
		int colStart = 0;
		int rowEnd = m-1;
		int colEnd = n-1;
		List<Integer> list = new ArrayList<>();
		
		while(rowStart <= rowEnd && colStart <= colEnd) {
			for(int i = rowStart; i <= rowEnd; i++) 
				list.add(matrix[i][colStart]);
			colStart++;
			
			for(int i = colStart; i <= colEnd; i++) 
				list.add(matrix[rowEnd][i]);
			rowEnd--;
			
			if(colStart <= colEnd) 
				for(int i = rowEnd; i >= rowStart; i--) 
					list.add(matrix[i][colEnd]);
			colEnd--;
			
			if(rowStart <= rowEnd)
				for(int i = colEnd; i >= colStart; i--) 
					list.add(matrix[rowStart][i]);
			rowStart++;
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		int matrix[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
		spiralAnticlockWise(matrix);
	}
}
