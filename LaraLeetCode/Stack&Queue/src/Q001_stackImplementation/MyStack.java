package Q001_stackImplementation;

public class MyStack {
	private static final int Max_SIZE = 10;
	private int[] stack = new int[Max_SIZE];
	private int index = -1;

	public void push(int element)
	{
		if (index == Max_SIZE) {
			System.out.println("stack isfull");
			return;
		}
		index++;
		stack[index] = element;
	}

	public int peek() {
		if (index == -1) {
			System.out.println("no element in the stack");
			return -1;
		}
		return stack[index];
	}

	public int pop() {
		if (index == -1) {
			System.out.println("no element in the stack");
			return -1;
		}
		int element = stack[index];
		index--;
		return element;
	}

	public int size() {
		return index + 1;
	}

	public boolean isEmpty() {
		return index == -1 ? true : false;

	}
}