package A004_spiralReverse;

import java.util.*;

public class Solution {
	public static List<Integer> spiralInReverseOrder(int matrix[][]) {
		int n = matrix.length;
		int rs, re, cs, ce;
		boolean isOddLength = false;
		List<Integer> list = new ArrayList();

		if (n % 2 == 0) {
			re = n/2;
			rs = re-1;
			cs = rs;
			ce = re;
		} else {
			rs = re = cs = ce = n / 2;
			isOddLength = true;
		}

		if (isOddLength)
			list.add(matrix[rs][cs]);
		while (rs >= 0 && cs >= 0) {
			for (int i = rs + 1; i <= re; i++)
				list.add(matrix[i][cs]);
			for (int i = cs + 1; i <= ce; i++)
				list.add(matrix[re][i]);
			for (int i = re - 1; i >= rs; i--)
				list.add(matrix[i][ce]);
			for (int i = ce - 1; i >= cs; i--)
				list.add(matrix[rs][i]);
			rs--;
			cs--;
			re++;
			ce++;

		}
		return list;
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1,  2,  3,  4,  5 }, 
						   { 16, 17, 18, 19, 6 }, 
						   { 15, 24, 25, 20, 7 }, 
						   { 14, 23, 22, 21, 8 },
						   { 13, 12, 11, 10, 9 } };
		System.out.println(spiralInReverseOrder(matrix)+"\n");
		int matrix1[][] = { { 1,  2,  3,  4,  5,  6 }, 
							{ 20, 21, 22, 23, 24, 7 }, 
							{ 19, 32, 33, 34, 25, 8 },
							{ 18, 31, 36, 35, 26, 9 }, 
							{ 17, 30, 29, 28, 27, 10 }, 
							{ 16, 15, 14, 13, 12, 11 } };
		System.out.println(spiralInReverseOrder(matrix1));
	}

}
