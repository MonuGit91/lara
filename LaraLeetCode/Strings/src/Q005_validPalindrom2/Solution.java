package Q005_validPalindrom2;

class Solution {
	public static void main(String[] args) {
		System.out.println("input: aba");
		System.out.println("output: " + validPalindrome("aba"));
		System.out.println("\ninput: abca");
		System.out.println("output: " + validPalindrome("abca"));
	}
    private static boolean isPalindrome(String s, int i, int j, int count) {
    	if(count > 1) return false;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
            	if(isPalindrome(s, i+1, j, count+1) || isPalindrome(s, i, j-1, count+1)) return true;
                else return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int n = s.length();
        return isPalindrome(s, 0, n-1, 0);
    }
}
