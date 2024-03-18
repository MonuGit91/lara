package pack1;

public class M1 {
	public static void main(String[] args) {
		Thread.State[] states = Thread.State.values();
		for(Thread.State state : states) {
			System.out.println(state);
		}
	}
}
/*
States of Thread Life Cycle
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED

 */
