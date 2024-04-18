package Q001_anagram;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "margana";
		System.out.println(isAnagram(s1, s2));
	}
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) return false;
		}
		return true;
	}

}
