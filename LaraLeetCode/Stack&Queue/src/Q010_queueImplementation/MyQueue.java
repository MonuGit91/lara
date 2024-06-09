package Q010_queueImplementation;

public class MyQueue {
	private int[] nums = new int[10];
	private int size;
	
	public void enqueue(int num) {
		if(size >= nums.length) {
			System.out.println("Queue is full");
			return;
		}
		nums[size++] = num;
	}
	public int peek() {
		if(size == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return nums[0];
	}
	public int dequeue() { 
		if(size == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int num = nums[0];
		for(int i = 1; i < size; i++) {
			nums[i-1] = nums[i];
		}
		size--;
		return num;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public String toString() {// overriding Object class method 
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(nums[i] + ", ");
		}
		return sb.toString();
	}
}
