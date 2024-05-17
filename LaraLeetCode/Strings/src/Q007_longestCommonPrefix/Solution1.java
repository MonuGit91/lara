package Q007_longestCommonPrefix;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		String[] s = {"flower","flow","flight"};
		System.out.println("output1: " + longestCommonPrefix(s));
		
		String[] s1 = {"dog","racecar","car"};
		System.out.println("output2: " + longestCommonPrefix(s1));
	}
	public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder commonPrefix = new StringBuilder();
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int n = firstString.length() < lastString.length() ? 
        		firstString.length() : lastString.length();
        
        for(int i = 0; i < n; i++) {
        	if(firstString.charAt(i) == lastString.charAt(i)) {
        		commonPrefix.append(firstString.charAt(i));
        	}
        	else break;
        }
        return commonPrefix.toString();
    }

}
