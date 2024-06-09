package q027_subarraysWithXOR_K;

import java.util.*;
public class Solution1 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 2};
		int b = 2;
		System.out.println(subarraysWithSumK(a, b));
		
		a = new int[]{1, 3, 3, 3, 5};
		b = 6;
		System.out.println(subarraysWithSumK(a, b));
	}
	
	public static int subarraysWithSumK(int []a, int k) {
        // Write your code here
        int count = 0, xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < a.length; i++) {
            xor = xor^a[i];
            int x = xor^k;
            /*
             * a b c d e
             * total XOR = xor
             * 
             *   a   b c d e 
             * -(x)  --(k)-- = x^k = xor
             * 
             * x^k^k = xor^k
             * => x = xor^k
             * 
             */
            if(map.containsKey(x)) {
                count+=map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return count;
    }
}






/*
 * 
 * static
 * 
 */
