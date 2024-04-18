package Q005_validPalindrom2;

class Solution {
	public static void main(String[] args) {
		System.out.println(validPalindrome("321A man, a plan, a canal: Panama123"));
	}
    private static boolean validPalindrom(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) 
                return false;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) 
                if(validPalindrom(s, i+1, j) || validPalindrom(s, i, j-1))
                    return true; 
                else 
                    return false;
            i++;
            j--;
        }
        return true;
    }
}
