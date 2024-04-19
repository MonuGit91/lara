package Q007_longestCommonPrefix;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String[] s = {"flower","flow","flight"};
		System.out.println("output1: " + longestCommonPrefix(s));
		
		String[] s1 = {"dog","racecar","car"};
		System.out.println("output2: " + longestCommonPrefix(s1));
	}
	public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        for(int i = 0; i < strs[0].length(); i++) {
        	if(strs[0].charAt(i) == strs[n-1].charAt(i)) {
        		sb.append(strs[0].charAt(i)); 
        	}
        	else break;
        }
        return sb.toString();
    }
}
