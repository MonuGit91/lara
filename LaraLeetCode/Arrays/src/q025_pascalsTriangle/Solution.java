package q025_pascalsTriangle;

import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		List<List<Integer>> mat = sol.generate(5);
		mat.forEach(System.out::println);
	}
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mat = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            mat.add(new ArrayList<>());
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    mat.get(i).add(1);
                } else {
                    int val = mat.get(i-1).get(j-1)+mat.get(i-1).get(j);
                    mat.get(i).add(val);
                }
            }
        }
        return mat;
    }

}
