package Q003_removeAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution_1 {
	
	public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)) 
                stk.pop();
            else stk.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()) {
        	ans.append(stk.pop());
        }
        ans.reverse();
        return ans.toString();
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.removeDuplicates("abbaca"));//ca
		System.out.println(sol.removeDuplicates("azxxzy"));//ay
	}
}
