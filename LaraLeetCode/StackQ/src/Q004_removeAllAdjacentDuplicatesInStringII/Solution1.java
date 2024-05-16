package Q004_removeAllAdjacentDuplicatesInStringII;

import java.util.*;
import java.lang.StringBuilder;

class Pair{
    Character ch;
    int count;
    Pair(char c, int count) {
        this.ch = c;
        this.count = count;
    }
    public String toString() {
        return ""+ch;
    }
    public boolean equals(Object ch1) {
        if(ch1 instanceof Character) {
            Character obj = (Character)ch1;
            return this.ch.equals(obj);
        }
        return false;
    }
}
public class Solution1 {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!stk.isEmpty() && stk.peek().equals(ch)) {
                if(stk.peek().count == k-1) {
                    stk.pop();
                }
                else {
                    stk.peek().count++;
                }
            }
            else stk.push(new Pair(ch, 1));
        }
        StringBuilder sb = new StringBuilder();
//        stk.forEach(ele -> sb.repeat(ele.ch, ele.count));
        stk.forEach(ele -> sb.append((""+ele.ch).repeat(ele.count)));
        return sb.toString();
    }
    public static void main(String[] args) {
    	Solution1 obj = new Solution1();
    	String str = obj.removeDuplicates("abcd", 2);
    	System.out.println(str);
    	
    	str = obj.removeDuplicates("deeedbbcccbdaa", 3);
    	System.out.println(str);
	}
}