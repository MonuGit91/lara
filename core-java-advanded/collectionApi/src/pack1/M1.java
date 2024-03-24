package pack1;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class M1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(909);
		list.add("abc");
		list.add(909);
		list.add(true);
		list.add('t');
		System.out.println(list);
	}
}
/*  Adding elements
 *  -----------------------
 * 1.
 * add(Object element) -> addes elemtnts at the end
 * 2.
 * add(int index, Object ele) -> we can choos the location
 * 3.
 * addAll(int index, list list) -> while adding one arraylist u can choos which location u want
 * 4.
 * ArrayList list1 = new Arraylist(()
 * ArrayList list2 = new ArrayList(list) ->through constructor supply list
 * 
 * 
 * Reading:
 * -----------
 * 5.
 * get(int index)
 * 6.
 * size()
 * 7.
 * set(int index, Object obj) -> replace obj at perticular index
 * 8.
 * -remove(int index)
 * -remove(Object obj)
 * 9.
 * contains(Object obj)
 * 
 * 
 * 
 * 
 * 
 */
