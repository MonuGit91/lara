package Q007_dailyTemperatures;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public static int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < temperatures.length; i++) {
        	while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
        		ans[stk.peek()] = i-stk.peek();
        		stk.pop();
        	}
        	stk.push(i);
        }
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(dailyTemperatures(arr)));
	}

}
