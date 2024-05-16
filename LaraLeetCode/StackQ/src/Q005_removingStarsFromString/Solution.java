package Q005_removingStarsFromString;

import java.util.*;
public class Solution {
	public static String removeStars(String s) {
      Stack<Character> stk = new Stack<>();
      for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) == '*') {
              if(!stk.isEmpty()) stk.pop();
          }
          else stk.push(s.charAt(i));
      }
      StringBuilder sb = new StringBuilder();
      stk.forEach(ele -> sb.append(ele));
      return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(removeStars("leet**cod*e"));
		System.out.println(removeStars("erase*****"));
	}
}
