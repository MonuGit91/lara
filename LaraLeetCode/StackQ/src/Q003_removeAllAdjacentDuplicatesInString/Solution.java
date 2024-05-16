package Q003_removeAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution {
	public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)) 
                stk.pop();
            else stk.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        stk.forEach(ch -> ans.append(ch));
        return ans.toString();
    }
	public static void main(String[] args) {
		
	}

}
