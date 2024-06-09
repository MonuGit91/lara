package Q009_topKFrequentElements;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.ToIntFunction;
import java.util.function.Consumer;
public class Solution2{
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		Queue<Integer> pq = new PriorityQueue<>((key1, key2) -> map.get(key1)-map.get(key2));
//		Queue<Integer> pq = new PriorityQueue<>(new Comparator<>() {
//			public int compare(Integer key1, Integer key2) {
//				return map.get(key1)-map.get(key2);
//			}
//		});
		
        for(int val : nums) {
        	map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        map.keySet().forEach(key -> {
        	pq.offer(key);
        	if(pq.size() > k) pq.poll();
        });
//        map.keySet().forEach(new Consumer<>() {
//        	public void accept(Integer val) {
//        		pq.offer(val);
//        		if(pq.size() > k) pq.poll();
//        	}
//        });
        
        int []ans = pq.stream().mapToInt(Integer::intValue).toArray();
//        ans = pq.stream().mapToInt(new ToIntFunction<Integer>() {
//            @Override
//            public int applyAsInt(Integer value) {
//                return value.intValue();
//            }
//        }).toArray();
        
       
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3}, k =2;
		System.out.println(Arrays.toString(topKFrequent(arr, k)));
	}

}
