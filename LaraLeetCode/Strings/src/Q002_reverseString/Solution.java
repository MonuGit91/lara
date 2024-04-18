package Q002_reverseString;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		char[] arr = {'h','e','l','l','o'};
		System.out.println(Arrays.toString(arr));
		reverseString(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}
