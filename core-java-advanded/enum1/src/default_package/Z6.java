package default_package;

public class Z6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.State states[] = Thread.State.values();
		for(int i = 0; i < states.length; i++) {
			System.out.println(states[i]);
		}
	}

}
/*
here State is enum and here State.values() will return constants[]

output:
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED

- these all are thread life cycle
*/