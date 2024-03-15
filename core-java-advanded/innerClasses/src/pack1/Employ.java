package pack1;

public class Employ {
	String name;
	Job[] jobs;
	private int index;
	public Employ(String name, Job []jobs) {
		super();
		this.name = name;
		this.jobs = jobs;
	}
	boolean hashmorejob() {
		return index < jobs.length;
	}
	Job nextJob() {
		return jobs[index++];
	}
}
