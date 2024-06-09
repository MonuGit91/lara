package Q001_stackImplementation;

public class MyStack1 {
	private int[] nums = new int[10];
	private int size;

	public void push(int num)
	{
		if (size >= nums.length) {
			System.out.println("stack is full");
			return;
		}
		nums[size++] = num;
	}

	public int peek()
	{
		if (size == 0) {
			System.out.println("stack is empty");
			return -1;
		}
		return nums[size - 1];
	}

	public int pop()
	{
		if (size == 0) {
			System.out.println("stack is empty");
			return -1;
		}
		int num = nums[size - 1];
		size--;
		return num;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(nums[i] + ",");
		}
		return sb.toString();

	}
}
