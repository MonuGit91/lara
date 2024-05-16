package Q004_removeAllAdjacentDuplicatesInStringII;

import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.removeDuplicates("abcd", 2);
	}
	class Test {
		char c1;
		int count;
	}

	public String removeDuplicates(String s, int k) {
		Stack<Test> stack = new Stack<Test>();
		char c1;
		for (int i = 0; i < s.length(); i++) {
			c1 = s.charAt(i);
			if (!stack.isEmpty() && stack.peek().c1 == c1) {
				stack.peek().count++;
			} else {
				Test test = new Test();
				test.c1 = c1;
				test.count = 1;
				stack.push(test);
			}
			if (stack.peek().count == k) {
				stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		Test test;
		while (!stack.isEmpty()) {
			test = stack.pop();
			for (int i = 1; i <= test.count; i++) {
				sb.append(test.c1);
			}
		}
		sb.reverse();
		return sb.toString();
	}

}
