package Q006_maxConsicutiveChar;

public class Solution {
	public static void main(String[] args) {
		String s = "leetCode";
		System.out.println(maxPower(s));
	}
	public static int maxPower(String s) {
        int n = s.length();
        int maxLen = 1, len = 1;
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i-1)) len++;
            else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }
        return Math.max(maxLen, len);
    }
}
