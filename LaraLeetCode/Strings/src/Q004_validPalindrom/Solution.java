package Q004_validPalindrom;

public class Solution {
	public static void main(String[] args) {
		System.out.println(isPalindrome("321A man, a plan, a canal: Panama123"));
	}
	public static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            Character c = s.charAt(i);
            Character d = s.charAt(j);
            if(!Character.isLetterOrDigit(c)) {
            	i++;
            	continue;
            }
            if(!Character.isLetterOrDigit(d)) {
            	j--;
            	continue;
            }
            c = Character.toLowerCase(c);
            d = Character.toLowerCase(d);
            if(!c.equals(d)) return false;
            i++;
            j--;
        }

        return true;
    }
}
