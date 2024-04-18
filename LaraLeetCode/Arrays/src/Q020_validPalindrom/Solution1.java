package Q020_validPalindrom;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("321A man, a plan, a canal: Panama123"));
	}
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) 
			if(Character.isLetterOrDigit(s.charAt(i)))
				sb.append(s.charAt(i));
		
		String str = sb.toString().toLowerCase();
        int i = 0, j = str.length()-1;
        while(i <= j) {
            char c = str.charAt(i);
            char d = str.charAt(j);
            if(c != d) return false;
            i++;
            j--;
        }

        return true;
    }

}
