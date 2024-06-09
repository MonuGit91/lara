package Q002_validParentheses;

import java.util.Stack;
class Solution {
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            else {
                if(stk.isEmpty()) return false;
                char ch1 = stk.pop();
                if(ch1 == '(' && ch != ')') return false;
                else if(ch1 == '{' && ch != '}') return false;
                else if(ch1 == '[' && ch != ']') return false;
            }
        }
         return stk.isEmpty();
    }
    public static void main(String[] args) {
		System.out.println(isValid("()"));//true
		System.out.println(isValid("()[]{}"));//true
		System.out.println(isValid("(]"));//false
	}
}